/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package sample.camel;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import jakarta.ws.rs.core.Response;
import org.apache.camel.BindToRegistry;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.caffeine.CaffeineConstants;
import org.apache.camel.component.jacksonxml.JacksonXMLDataFormat;
import org.springframework.stereotype.Component;
import sample.model.fruit.Fruit;
import sample.model.fruit.FruitResponse;
import sample.model.person.Person;
import sample.model.person.PersonResponse;

import java.util.Collection;
import java.util.UUID;

import static org.apache.camel.model.rest.RestParamType.body;

@Component
public class CamelRouter extends RouteBuilder {

	@BindToRegistry("fruit-cache")
	Cache<String, FruitResponse> cache = Caffeine.newBuilder().recordStats().build();

	public CamelRouter() {
		cache.put("Apple", new FruitResponse(new Fruit("Apple", "Winter fruit"), "Red"));
		cache.put("Pineapple", new FruitResponse(new Fruit("Pineapple", "Tropical fruit"), "Yellow"));
	}

	@Override
	public void configure() throws Exception {

		// this can also be configured in application.properties
		restConfiguration();

		//very raw way, just to handle the validation responses
		onException(Exception.class)
				.handled(true)
				.setHeader(Exchange.HTTP_RESPONSE_CODE, constant(Response.Status.BAD_REQUEST.getStatusCode()))
				.setBody(simple("${exchangeProperty.CamelExceptionCaught.getMessage()}"));

		// Configure fruity endpoints.
		rest("/fruits").description("Fruits REST service")
				.consumes("application/json")
				.produces("application/json")

				.get().routeId("getFruits")
					.description("Find all fruits").outType(FruitResponse[].class)
					.responseMessage().code(200).message("All fruits successfully returned").endResponseMessage()
					.to("direct:getFruits")

				.post().routeId("createFruits")
					.description("Create a fruit").type(Fruit.class).outType(FruitResponse.class)
					.param().name("body").type(body).description("The fruit to create").endParam()
					.responseMessage().code(204).message("Fruity person successfully created").endResponseMessage()
					.to("direct:addFruit")

				.put().routeId("updateFruits")
					.description("Update a fruit").type(Fruit.class).outType(FruitResponse.class)
					.param().name("body").type(body).description("The fruit to update").endParam()
					.responseMessage().code(204).message("Fruity person successfully updated").endResponseMessage()
					.to("direct:updateFruit");

		from("direct:getFruits")
				.log("Return all fruits from cache.")
				.setBody(exchange -> {
					// Retrieve map from cache and convert to array.
					Collection<FruitResponse> fruits = cache.asMap().values();
					return fruits.toArray();
				})
				.log("Fruits: ${body}");

		from("direct:addFruit")
				.to("direct:initFruit") // Initialise
				.to("direct:certifyFruit") // Certify
				.to("direct:convertToPerson") // Convert
				.to("direct:printToFile"); // Print

		from("direct:updateFruit")
				.to("direct:initFruit") // Initialise
				.to("direct:certifyFruit") // Certify
				.to("direct:convertToPerson") // Convert
				.to("direct:printToFile"); // Print

		// Initialise fruit by assigning id and cache the request.
		from("direct:initFruit")

				.routeId("initFruit")
				.log("Initialise fruit ${body} ")
				.setVariable("instanceId", constant(UUID.randomUUID().toString()))
				.setBody(e -> {
					Fruit fruit = (Fruit) e.getIn().getBody();
					return new FruitResponse(fruit, "Unknown");
				})
				.setHeader(CaffeineConstants.KEY, simple("${variable.instanceId}"))
				.to("caffeine-cache://fruit-cache?action=PUT");

		// Calling the rest certification service to validate the fruit.
		from("direct:certifyFruit")

				.routeId("certifyFruitRestProducer")
				.log("Calling certification service ")

				// Set header variable to use as path parameter.
				.setHeader("fruit", simple("${body.name}"))
				.to("rest:get:certify/{fruit}?host=localhost:8082/api&outType=sample.model.certification.CertificationResponse")
				.log("Certification: ${body}")

				// Check if this fruit is certified.
				.choice()
						.when(simple("${body.certified} == 'Super' || ${body.certified} == 'Regular'"))
							.process(e -> {
								String instanceId = (String) e.getVariable("instanceId");
								FruitResponse fruitResponse = cache.getIfPresent(instanceId);
								if (fruitResponse != null) {
									fruitResponse.setColor("Certified");
									cache.put(instanceId, fruitResponse);
									e.getIn().setBody(fruitResponse);
								} else {
									throw new Exception("Missing fruit.");
								}
							})
						.otherwise()
							.throwException(new Exception("Not certified"));

		JacksonXMLDataFormat jacksonXml = new JacksonXMLDataFormat();
		jacksonXml.setUnmarshalType(PersonResponse.class); // Replace with your class
		jacksonXml.setPrettyPrint(true); // Optional: for human-readable XML

		// Fruit to Person conversion and processing.
		from("direct:convertToPerson")

				.routeId("convertToPerson")
				.log("Convert fruit to person")
				.convertBodyTo(Person.class);

		// Printing xml file with person details.
		from("direct:printToFile")

				.routeId("printToFile")
				// Set a variable with the name so we can use it later.
				.setVariable("filename", simple("${body.firstName}-${body.lastName}") )

				.log("Marshal to xml")
				.marshal(jacksonXml)

				.log("Print xml file.")
				.to("file:C:/Development/input?fileName=${variable.filename}.xml");

		// Camel route to scan folder for files.
		from("file:C:/Development/output?noop=true&readLock=changed&idempotent=true&move=.done")
				.unmarshal(jacksonXml)

				.log("Person response ${body}")
				.process(e -> {
					PersonResponse personResponse = e.getIn().getBody(PersonResponse.class);
					FruitResponse fruitResponse = cache.getIfPresent(personResponse.getInstanceId());
					if (fruitResponse == null) {
						throw new Exception("Fruit not found");
					} else {
						fruitResponse.setColor(personResponse.getStatus());
						cache.put(personResponse.getInstanceId(), fruitResponse);
					}
				})
				.to("caffeine-cache://fruit-cache?action=PUT&key=${body.instanceId}");

	}

}