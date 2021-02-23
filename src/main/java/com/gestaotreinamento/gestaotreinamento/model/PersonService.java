package com.gestaotreinamento.gestaotreinamento.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class PersonService {


    private final IPersonRepository iPersonRepository;

    public PersonService(IPersonRepository iPersonRepository) {
        this.iPersonRepository = iPersonRepository;
    }

    public PersonDTO savePerson(PersonDTO personDTO) {

        Person person = new Person();

        person.setName(personDTO.getName());
        person.setLastName(personDTO.getLastName());

        return PersonDTO.of(iPersonRepository.save(person));
    }

    public List<PersonDTO> findAll(){

        List<PersonDTO> persons = new ArrayList<>();

        iPersonRepository.findAll().forEach(person -> persons.add(PersonDTO.of(person)));

        return persons;
    }

}
