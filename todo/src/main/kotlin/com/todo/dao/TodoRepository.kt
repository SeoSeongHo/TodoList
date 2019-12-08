package com.todo.dao

import com.todo.entity.TodoItem
import org.springframework.data.jpa.repository.JpaRepository

interface TodoRepository : JpaRepository<TodoItem, Long>