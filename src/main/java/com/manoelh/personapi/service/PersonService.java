package com.manoelh.personapi.service;

import com.manoelh.personapi.dto.MessageResponseDTO;
import com.manoelh.personapi.dto.PersonDTO;
import com.manoelh.personapi.entity.Person;
import com.manoelh.personapi.mapper.PersonMapper;
import com.manoelh.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonService {

    private PersonRepository personRepository;
    private final PersonMapper personMapper;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
        personMapper = PersonMapper.INTANCE;
    }

    public MessageResponseDTO createPerson(PersonDTO personDTO) {

        Person personToSave = personMapper.toModel(personDTO);

        Person savedPerson = this.personRepository.save(personToSave);

        return MessageResponseDTO
                .builder().message("The person was saved with ID: " +savedPerson.getId())
                .build();
    }
}
