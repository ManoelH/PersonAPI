package com.manoelh.personapi.service;

import com.manoelh.personapi.dto.MessageResponseDTO;
import com.manoelh.personapi.entity.Person;
import com.manoelh.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(Person person) {
        Person savedPerson = this.personRepository.save(person);
        return MessageResponseDTO
                .builder().message("The person was saved with ID: " +savedPerson.getId())
                .build();
    }
}
