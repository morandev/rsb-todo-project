package com.example.application.endpoint;

import com.example.application.entity.Todo;
import com.example.application.repository.TodoRepository;
import com.vaadin.flow.server.auth.AnonymousAllowed;

import java.util.List;

import dev.hilla.Endpoint;
import dev.hilla.Nonnull;

@Endpoint
@AnonymousAllowed
public class TodoEndpoint {
    private TodoRepository todoRepository;

    public TodoEndpoint(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public @Nonnull List<@Nonnull Todo> findAll() {
        return this.todoRepository.findAll();
    }

    public Todo save(Todo todo) {
        return this.todoRepository.save(todo);
    }
}
