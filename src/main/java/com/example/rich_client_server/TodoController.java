package com.example.rich_client_server;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Nimmt die Anfragen vom Client entgegen und leitet diese ans Repository weiter.
 */
@RestController
@RequestMapping(path = "todos")
public class TodoController {

    final TodoRepository todoRepository;

    public TodoController(@Autowired TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Todo> getAllTodos() {
        return null;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{todoId}")
    public Todo findTodoById(@PathVariable("todoId") Long todoId) {
        return null;
    }

    @RequestMapping(method = RequestMethod.POST)
    public Todo addTodo(@RequestBody Todo todo) {
        return null;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/{todoId}")
    public Todo updateTodo(@PathVariable("todoId") Long todoId, @RequestBody Todo todo) {
        return null;
    }
}
