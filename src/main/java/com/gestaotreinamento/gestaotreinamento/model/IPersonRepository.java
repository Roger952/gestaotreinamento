package com.gestaotreinamento.gestaotreinamento.model;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonRepository extends MongoRepository<Person, String> {
}
