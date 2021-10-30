package com.example.rich_client_server;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SetupData {

    private final TodoRepository repository;

    public SetupData(@Autowired TodoRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    public void setupData() {
        repository.save(new Todo("Take the trash out", false));
        repository.save(new Todo("Feed the cat", false));
        repository.save(new Todo("Eat grandpa", true));
        repository.save(new Todo("Clean the bathroom", false));
    }
}
