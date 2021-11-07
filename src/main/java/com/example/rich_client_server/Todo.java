package com.example.rich_client_server;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Todo {

    @Id
    @GeneratedValue
    private Long id;

    @Size(message = "title must not be longer than 20 characters", max = 20)
    @NotBlank(message = "title must not be blank")
    private String title;

    private boolean done;

    public Todo(String title, boolean done) {
        this.title = title;
        this.done = done;
    }

    public Todo() {
        // empty default
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "Todo(id=" + id + ", title='" + title + '\'' + ", done=" + done + ')';
    }
}
