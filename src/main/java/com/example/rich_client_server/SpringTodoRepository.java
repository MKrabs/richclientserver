package com.example.rich_client_server;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringTodoRepository extends JpaRepository<Todo, Long> {
}
