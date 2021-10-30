package com.example.rich_client_server;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TodoRepository {

    private final SpringTodoRepository repository;

    public TodoRepository(@Autowired SpringTodoRepository repository) {
        this.repository = repository;
    }

    public List<Todo> findAll() {
        return repository.findAll();
    }

    public Todo find(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Todo save(Todo todo) {
        return repository.save(todo);
    }
}
