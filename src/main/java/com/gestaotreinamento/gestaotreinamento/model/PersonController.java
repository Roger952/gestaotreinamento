package com.gestaotreinamento.gestaotreinamento.model;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public ResponseEntity<PersonDTO> save(@RequestBody PersonDTO personDTO){

        return ResponseEntity.ok(personService.savePerson(personDTO));
    }

    @GetMapping
    public ResponseEntity<List> findAll(){

        return ResponseEntity.ok(personService.findAll());
    }
}
