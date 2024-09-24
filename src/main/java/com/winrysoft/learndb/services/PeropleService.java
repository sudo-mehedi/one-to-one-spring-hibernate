package com.winrysoft.learndb.services;


import org.springframework.stereotype.Service;

import com.winrysoft.learndb.entity.Person;
import com.winrysoft.learndb.repository.PersonRepository;

@Service
public class PeropleService {
    PersonRepository personRepository;

    public PeropleService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person getPersonById(Integer id) {
        return null;
    }
}
