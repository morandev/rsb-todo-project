package com.example.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.application.entity.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {}
