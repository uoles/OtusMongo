package ru.otus.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.otus.mongo.domain.Person;
import ru.otus.mongo.repostory.PersonRepository;

@SpringBootApplication
public class Main implements CommandLineRunner {

    @SuppressWarnings("SpringJavaAutowiredFieldsWarningInspection")
    @Autowired
    private PersonRepository repository;

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Person("Mongol"));
        Thread.sleep(3000);
        repository.findAll().forEach(p -> System.out.println(p.getName() + " " + p.getDate()));
    }
}
