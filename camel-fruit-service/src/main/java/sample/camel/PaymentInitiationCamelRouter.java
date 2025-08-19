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
import iso20022.payments.initiation.CustomerCreditTransferInitiationV09;
import iso20022.payments.initiation.Pain001Document;
import iso20022.payments.statusreport.Pain002Document;
import jakarta.ws.rs.core.Response;
import org.apache.camel.BindToRegistry;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.caffeine.CaffeineConstants;
import org.apache.camel.component.jacksonxml.JacksonXMLDataFormat;
import org.springframework.stereotype.Component;
import sample.model.payments.PaymentInitiation;
import sample.model.person.PersonResponse;

import java.util.Collection;
import java.util.UUID;

import static org.apache.camel.model.rest.RestParamType.body;

@Component
public class PaymentInitiationCamelRouter extends RouteBuilder {

	@BindToRegistry("payments-cache")
	Cache<String, PaymentInitiation> cache = Caffeine.newBuilder().recordStats().build();

	public PaymentInitiationCamelRouter() {
		super();
	}

	@Override
	public void configure() throws Exception {

		// this can also be configured in application.properties
		restConfiguration();

		// very raw way, just to handle the validation responses
		onException(Exception.class)
				.handled(true)
				.setHeader(Exchange.HTTP_RESPONSE_CODE, constant(Response.Status.BAD_REQUEST.getStatusCode()))
				.setBody(simple("${exchangeProperty.CamelExceptionCaught.getMessage()}"));

		// Configure payment endpoints.
		rest("/payments").description("Payment Initiation REST service")
				.consumes("application/json")
				.produces("application/json")

				.get().routeId("getPayments")
					.description("Find all payments").outType(PaymentInitiation[].class)
					.responseMessage().code(200).message("All Payments successfully returned").endResponseMessage()
					.to("direct:getPayments")

				.post().routeId("createPayment")
					.description("Create a payment").type(CustomerCreditTransferInitiationV09.class).outType(PaymentInitiation.class)
					.param().name("body").type(body).description("The payment to create").endParam()
					.responseMessage().code(204).message("Payment initiation successfully created").endResponseMessage()
					.to("direct:createPayment");

		from("direct:getPayments")
				.log("Return all payments from cache.")
				.setBody(exchange -> {
					// Retrieve map from cache and convert to array.
					Collection<PaymentInitiation> payments = cache.asMap().values();
					return payments.toArray();
				})
				.log("Payments: ${body}");

		from("direct:createPayment")
				.to("direct:initPayment") // Initialise
				.to("direct:validatePayment") // Account Validation
				.to("direct:printPaymentInitiationToFile"); // Print

		// Initialise payment by assigning id and cache the request.
		from("direct:initPayment")

				.routeId("initPayment")
				.log("Initialise payment ${body} ")
				.setVariable("instanceId", constant(UUID.randomUUID().toString()))
				.setBody(e -> {
					String instanceId = (String) e.getVariable("instanceId");
					CustomerCreditTransferInitiationV09 payment = e.getIn().getBody(CustomerCreditTransferInitiationV09.class);
					return new PaymentInitiation(instanceId, payment);
				})
				.setHeader(CaffeineConstants.KEY, simple("${variable.instanceId}"))
				.to("caffeine-cache://payment-cache?action=PUT");

		// Calling the rest certification service to validate the payment.
		from("direct:validatePayment")

				.routeId("validatePaymentRestProducer")
				.log("Calling validation service ");

		JacksonXMLDataFormat jacksonXml = new JacksonXMLDataFormat();
		jacksonXml.setUnmarshalType(PersonResponse.class); // Replace with your class
		jacksonXml.setPrettyPrint(true); // Optional: for human-readable XML

		// Printing xml file with person details.
		from("direct:printPaymentInitiationToFile")

				.routeId("printPaymentInitiationToFile")

				.log("Marshal to xml")
				.setBody(exchange -> {
					PaymentInitiation paymentInitiation = exchange.getIn().getBody(PaymentInitiation.class);
					Pain001Document pain001Document = new Pain001Document();
					pain001Document.setCstmrCdtTrfInitn((CustomerCreditTransferInitiationV09) paymentInitiation.getCreditTransferInitiation());
					return pain001Document;
				})
				.marshal(jacksonXml)

				.log("Print xml file.")
				.to("file:C:/Development/payment-input?fileName=${variable.instanceId}.xml");

		// Camel route to scan folder for files.
		from("file:C:/Development/payment-output?noop=true&readLock=changed&idempotent=true&move=.done")

				.routeId("paymentReportStatusFeedback")
				.unmarshal(jacksonXml)

				.log("Person response ${body}")
				.process(e -> {
					Pain002Document pain002Document = e.getIn().getBody(Pain002Document.class);
					//paymentResponse paymentResponse = cache.getIfPresent(personResponse.getInstanceId());
					//if (paymentResponse == null) {
					//	throw new Exception("payment not found");
					//} else {
					//	paymentResponse.setColor(personResponse.getStatus());
					//	cache.put(personResponse.getInstanceId(), paymentResponse);
					//}
				})
				.to("caffeine-cache://payment-cache?action=PUT&key=${body.instanceId}");

	}

}