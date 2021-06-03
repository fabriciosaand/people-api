package com.fabriciosaand.personapi.service;

import com.fabriciosaand.personapi.dto.request.PersonDTO;
import com.fabriciosaand.personapi.dto.response.MessageResponseDTO;
import com.fabriciosaand.personapi.entity.Person;
import com.fabriciosaand.personapi.mapper.PersonMapper;
import com.fabriciosaand.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(PersonDTO personDTO){

        Person personToSave = personMapper.personDTOtoPerson(personDTO);

        Person savedPerson = personRepository.save(personToSave);
        return MessageResponseDTO
                .builder()
                .message("Created person with ID "+ savedPerson.getId())
                .build();
    }

    public List<PersonDTO> listAll() {
        List<Person> allPeople = personRepository.findAll();
        return allPeople.stream()
                .map(personMapper::personToPersonDTO)
                .collect(Collectors.toList());
    }
}
