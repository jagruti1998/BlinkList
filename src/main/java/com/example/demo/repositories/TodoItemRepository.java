package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.TodoItems;

public interface TodoItemRepository extends CrudRepository<TodoItems, Long> {     

}
