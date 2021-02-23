package com.gestaotreinamento.gestaotreinamento.model;

import org.springframework.stereotype.Service;

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
}
