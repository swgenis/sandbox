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
import org.springframework.stereotype.Component;
import sample.model.certification.CertificationResponse;

import static org.apache.camel.model.rest.RestParamType.path;

@Component
public class CamelRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		// this can also be configured in application.properties
		restConfiguration();

		validator()
				.type("certification")
				.withBean("certificationValidator");

		rest("/certify").description("Certification REST service")
				.consumes("application/json")
				.produces("application/json")

				.get("/{fruit}").description("Fruit certification service.")
					.param().name("fruit").type(path).description("The fruit").dataType("string").endParam()
					.responseMessage().code(200).message("Checked fruit certification").endResponseMessage()
					.to("direct:certifyFruit");

		from("direct:certifyFruit")

				.routeId("certifyFruit")
				.log("User validation to certify fruit.")
				.inputTypeWithValidate("certification")

				.log("Build certification response.")
				.choice()
					.when(simple("${header.fruit} == 'Banana'"))
						.setBody(constant(new CertificationResponse("Super")))
					.otherwise()
						.setBody(constant(new CertificationResponse("Regular")));

	}

}