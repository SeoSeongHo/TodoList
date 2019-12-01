package com.todo.services.todo

import com.todo.dto.TodoDto
import com.todo.model.TodoItem

interface TodoRegisterService {
    fun getTodoList() : List<TodoDto>
    fun getTodo(id : Long) : TodoDto
    fun postTodo(todoDto: TodoDto) : TodoDto
    fun deleteTodo(id : Long)
}