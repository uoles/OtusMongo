package ru.otus.mongo.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document
public class Person {

    @Id
    private String id;

    private String name;

    private Date date;

    public Person(String name) {
        this.name = name;
        this.date = new Date();
    }
}
