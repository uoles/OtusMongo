package ru.otus.mongo.repostory;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.otus.mongo.domain.Person;

import java.util.List;

public interface PersonRepository extends MongoRepository<Person, Integer> {

    List<Person> findAll();
}
