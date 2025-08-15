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

import org.springframework.stereotype.Service;
import sample.model.person.Person;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

@Service("personService")
public class PersonServiceImpl implements PersonService {

    private final Map<String, Person> people = new TreeMap<>();

    public PersonServiceImpl() {
        people.put("John", new Person("1", "John", "Coltrane", 45));
        people.put("Miles", new Person("2", "Miles",  "Davis", 23));
        people.put("Sonny", new Person("3", "Sonny",  "Rollins", 60));
    }

    @Override
    public Person findPerson(String instanceId) {
        return people.get(instanceId);
    }

    @Override
    public Collection<Person> findPersons() {
        return people.values();
    }

    @Override
    public Person createPerson(Person person) {
        people.put(person.getInstanceId(), person);
        return people.get(person.getInstanceId());
    }

    @Override
    public Person updatePerson(Person person) {
        people.put(person.getInstanceId(), person);
        return people.get(person.getInstanceId());
    }

}
