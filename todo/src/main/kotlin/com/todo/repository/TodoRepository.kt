package com.todo.repository

import com.todo.model.TodoItem
import org.springframework.data.jpa.repository.JpaRepository

interface TodoRepository : JpaRepository<TodoItem, Long>