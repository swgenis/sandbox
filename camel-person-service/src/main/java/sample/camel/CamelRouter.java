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

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jacksonxml.JacksonXMLDataFormat;
import org.springframework.stereotype.Component;
import sample.model.person.Person;
import sample.model.person.PersonResponse;

@Component
public class CamelRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		// this can also be configured in application.properties
		restConfiguration();

		// REST endpoint route to display people dashboard
		rest("/people").description("People REST service")
				.consumes("application/json")
				.produces("application/json")

				.get().description("Find all fruity people").outType(Person[].class)
				.responseMessage().code(200).message("All people successfully returned").endResponseMessage()
				.to("direct:getPersons");

		from("direct:getPersons")
				.log("Return all people from the person service.")
				.to("bean:personService?method=findPersons");

		JacksonXMLDataFormat xmlDataFormat = new JacksonXMLDataFormat();
		xmlDataFormat.setUnmarshalType(Person.class); // Replace with your class
		xmlDataFormat.setPrettyPrint(true); // Optional: for human-readable XML

		// Camel route to scan folder for files.
		from("file:C:/Development/input?noop=true&readLock=changed&idempotent=true&move=.done")

				.routeId("mockPersonService")
				.unmarshal(xmlDataFormat)

				.log("Add Person ${body}")
				.to("bean:personService?method=createPerson")

				// Set a variable with the name so we can use it later.
				.setVariable("filename", simple("${body.firstName}-${body.lastName}") )
				.setBody(e -> {
					Person person = e.getIn().getBody(Person.class);
					return new PersonResponse(person.getInstanceId(), "CREATED");
				})

				.log("Marshal to xml: ${body}")
				.marshal(xmlDataFormat)

				.log("Print xml file.")
				.to("file:C:/Development/output?fileName=${variable.filename}.xml");

	}

}