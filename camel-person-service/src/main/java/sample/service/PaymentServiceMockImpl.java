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
package sample.service;

import iso20022.payments.initiation.Pain001Document;
import iso20022.payments.statusreport.CustomerPaymentStatusReportV09;
import iso20022.payments.statusreport.Pain002Document;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

@Service("paymentService")
public class PaymentServiceMockImpl {

    private final Map<String, Pain002Document> statusReports = new TreeMap<>();

    public PaymentServiceMockImpl() {
    }

    public Pain002Document findPerson(String messageId) {
        return statusReports.get(messageId);
    }

    public Collection<Pain002Document> findPersons() {
        return statusReports.values();
    }

    public Pain002Document createPerson(Pain001Document pain001Document) {
        String messageId = pain001Document.getCstmrCdtTrfInitn().getGrpHdr().getMsgId();
        statusReports.put(messageId, toStatusReport(pain001Document));
        return statusReports.get(messageId);
    }

    public Pain002Document updatePerson(Pain001Document pain001Document) {
        String messageId = pain001Document.getCstmrCdtTrfInitn().getGrpHdr().getMsgId();
        statusReports.put(messageId, toStatusReport(pain001Document));
        return statusReports.get(messageId);
    }

    private Pain002Document toStatusReport(Pain001Document pain001Document) {

        Pain002Document pain002Document = new Pain002Document();
        CustomerPaymentStatusReportV09 statusReportV09 = new CustomerPaymentStatusReportV09();
        pain002Document.setCstmrPmtStsRpt(statusReportV09);
        return pain002Document;
    }

}
