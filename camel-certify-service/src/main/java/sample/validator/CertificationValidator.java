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
package sample.validator;

import org.apache.camel.Message;
import org.apache.camel.ValidationException;
import org.apache.camel.spi.DataType;
import org.apache.camel.spi.Validator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component("certificationValidator")
public class CertificationValidator extends Validator {

    private static final Logger LOG = LoggerFactory.getLogger(CertificationValidator.class);

    private final String[] fruits = {"Banana", "Apple", "Orange", "Pineapple", "Peach", "Pear"};

    @Override
    public void validate(Message message, DataType type) throws ValidationException {

        Object fruit = message.getHeader("fruit");
        LOG.info("Validating : [{}]", fruit);
        if (fruit instanceof String && Arrays.asList(fruits).contains(fruit)) {
            LOG.info("OK");
        } else {
            throw new ValidationException(message.getExchange(), "This ain't no fruit.");
        }
    }

}
