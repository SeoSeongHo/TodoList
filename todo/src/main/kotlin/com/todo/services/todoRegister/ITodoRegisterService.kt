package com.todo.services.todoRegister

import com.todo.dto.TodoDto

interface ITodoRegisterService {
    fun getTodoList() : List<TodoDto>
    fun getTodo(id : Long) : TodoDto
    fun postTodo(todoDto: TodoDto) : TodoDto
    fun deleteTodo(id : Long)
}