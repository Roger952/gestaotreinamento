package com.gestaotreinamento.gestaotreinamento.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class PersonDTO {

    String id;
    String name;
    String lastName;

    public static PersonDTO of(Person person){

        return new PersonDTO(
                person.getId(),
                person.getName(),
                person.getLastName()
        );
    }
}
