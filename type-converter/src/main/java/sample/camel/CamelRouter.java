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
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import sample.model.Fruit;
import sample.model.Person;

import java.util.Collection;

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

		from("direct:addFruit")
				.log("Add fruit ${body} ")
				.to("caffeine-cache://fruit-cache?action=PUT&key=${body.name}")

				// Convert the fruit to a fruity person.
				.to("direct:convertToPerson")

				// Create the person in the person service.
				.log("Add Person ${body}")
				.to("bean:personService?method=createPerson")

				.to("caffeine-cache://fruit-cache?action=GET&key=${body.name}");

		from("direct:addFruit")
				.log("Add fruit ${body} ")
				.to("caffeine-cache://fruit-cache?action=PUT&key=${body.name}")

				// Convert the fruit to a fruity person.
				.to("direct:convertToPerson")

				// Update the person in the person service.
				.log("Update Person ${body}")
				.to("bean:personService?method=updatePerson")

				.to("caffeine-cache://fruit-cache?action=GET&key=${body.name}");

		from("direct:getFruits")
				.log("Return all fruits from cache.")
				.process(exchange -> {
					// Retrieve map from cache and convert to array.
					Collection<Fruit> fruits = cache.asMap().values();
					exchange.getIn().setBody(fruits.toArray());
				})
				.log("Fruits: ${body}");

		from("direct:convertToPerson")
				.log("Convert fruit to person")
				.convertBodyTo(Person.class);

		rest("/people").description("People REST service")
				.consumes("application/json")
				.produces("application/json")

				.get().description("Find all fruity people").outType(Person[].class)
					.responseMessage().code(200).message("All people successfully returned").endResponseMessage()
					.to("direct:getPersons");

		from("direct:getPersons")
				.log("Return all people from the person service.")
				.to("bean:personService?method=findPersons");

	}
}