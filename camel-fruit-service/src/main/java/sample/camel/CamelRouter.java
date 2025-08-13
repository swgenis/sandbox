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
import org.apache.camel.BindToRegistry;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jacksonxml.JacksonXMLDataFormat;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import sample.fruit.Fruit;
import sample.person.Person;

import java.util.Collection;
import java.util.UUID;

import static org.apache.camel.model.rest.RestParamType.body;

@Component
public class CamelRouter extends RouteBuilder {

	@Autowired
	private Environment env;

	@Value("${camel.servlet.mapping.context-path}")
	private String contextPath;

	@BindToRegistry("fruit-cache")
	Cache<String, Fruit> cache = Caffeine.newBuilder().recordStats().build();

	public CamelRouter() {
		cache.put("Apple", new Fruit("Apple", "Winter fruit"));
		cache.put("Pineapple", new Fruit("Pineapple", "Tropical fruit"));
	}

	@Override
	public void configure() throws Exception {

		// this can also be configured in application.properties
		restConfiguration()
				.component("servlet")
				.bindingMode(RestBindingMode.json)
				.dataFormatProperty("prettyPrint", "true")
				.enableCORS(true)
				.port(env.getProperty("server.port", "8080"))
				.contextPath(contextPath.substring(0, contextPath.length() - 2))
				// turn on openapi api-doc
				.apiContextPath("/api-doc")
				.apiProperty("api.title", "Fruity People API")
				.apiProperty("api.version", "1.0.0");

		// Configure fruity endpoints.
		rest("/fruits").description("Fruits REST service")
				.consumes("application/json")
				.produces("application/json")

				.get().description("Find all fruits").outType(Fruit[].class)
					.responseMessage().code(200).message("All fruits successfully returned").endResponseMessage()
					.to("direct:getFruits")

				.post().description("Create a fruit").type(Fruit.class).outType(Fruit.class)
					.param().name("body").type(body).description("The fruit to create").endParam()
					.responseMessage().code(204).message("Fruity person successfully created").endResponseMessage()
					.to("direct:addFruit")

				.put().description("Update a fruit").type(Fruit.class).outType(Fruit.class)
					.param().name("body").type(body).description("The fruit to update").endParam()
					.responseMessage().code(204).message("Fruity person successfully updated").endResponseMessage()
					.to("direct:updateFruit");

		from("direct:getFruits")
				.log("Return all fruits from cache.")
				.process(exchange -> {
					// Retrieve map from cache and convert to array.
					Collection<Fruit> fruits = cache.asMap().values();
					exchange.getIn().setBody(fruits.toArray());
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
				.log("Initialise fruit ${body} ")
				.setVariable("instanceId", constant(UUID.randomUUID().toString()))
				.to("caffeine-cache://fruit-cache?action=PUT&key=${variable.instanceId}");

		// Calling the rest certification service to validate the fruit.
		from("direct:certifyFruit")
				.log("Calling certification service ")

				// Set header variable to use as path parameter.
				.setHeader("fruit", simple("${body.name}"))
				.to("rest:get:certify/{fruit}?host=localhost:8082/api&outType=sample.certification.CertificationResponse")
				.log("Certification: ${body}")

				// Check if this fruit is certified.
				.choice()
						.when(simple("${body.certified} == 'Super' || ${body.certified} == 'Regular'"))
							.to("caffeine-cache://fruit-cache?action=GET&key=${variable.instanceId}")
						.otherwise()
							.throwException(new Exception("Not certified"));

		JacksonXMLDataFormat jacksonXml = new JacksonXMLDataFormat();
		jacksonXml.setPrettyPrint(true); // Optional: for human-readable XML

		// Fruit to Person conversion and processing.
		from("direct:convertToPerson")

				.log("Convert fruit to person")
				.convertBodyTo(Person.class);

		// Printing xml file with person details.
		from("direct:printToFile")

				// Set a variable with the name so we can use it later.
				.setVariable("filename", simple("${body.firstName}-${body.lastName}") )

				.log("Marshal to xml")
				.marshal(jacksonXml)

				.log("Print xml file.")
				.to("file:C:/Development/input?fileName=${variable.filename}.xml");

	}

}