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
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import sample.model.CertificationResponse;

@Component
public class CamelRouter extends RouteBuilder {

	@Autowired
	private Environment env;

	@Value("${camel.servlet.mapping.context-path}")
	private String contextPath;

	@Override
	public void configure() throws Exception {

		// this can also be configured in application.properties
		restConfiguration()
				.component("servlet")
				.bindingMode(RestBindingMode.json)
				.dataFormatProperty("prettyPrint", "true")
				.enableCORS(true)
				.port(env.getProperty("server.port", "8081"))
				.contextPath(contextPath.substring(0, contextPath.length() - 2))
				// turn on openapi api-doc
				.apiContextPath("/api-doc")
				.apiProperty("api.title", "Certification API")
				.apiProperty("api.version", "1.0.0");

		validator()
				.type("certification")
				.withBean("certificationValidator");

		rest("/certify").description("Certification REST service")
				.consumes("application/json")
				.produces("application/json")

				.get().description("Fruit certification service.")
					.responseMessage().code(200).message("Checked fruit certification").endResponseMessage()
					.to("direct:certifyFruit");

		from("direct:certifyFruit")
				.log("Return all people from the person service.")
				.outputTypeWithValidate("certification")
				.choice()
					.when(simple("${body.name}"))
						.process(e -> {
							CertificationResponse response = e.getMessage().getBody(CertificationResponse.class);
							response.setCertified("Super");
						})
					.otherwise()
						.throwException(new RuntimeException("Unknown Fruit."));

	}

}