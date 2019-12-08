package com.todo.services.todoRegister

import com.todo.dto.TodoDto
import com.todo.dto.mapper.TodoDtoMapper
import com.todo.entity.TodoItem
import com.todo.dao.TodoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TodoRegisterService (
        @Autowired val todoRepository: TodoRepository
) : ITodoRegisterService {
    override fun getTodo(id : Long): TodoDto {
        val todo = todoRepository.findById(id)
        if(todo.isPresent){
            return TodoDtoMapper.mapToDto(todo.get())
        }
        throw Exception()
    }

    override fun getTodoList(): List<TodoDto> {
        val todoList : List<TodoItem> = todoRepository.findAll()
        return todoList.map {TodoDtoMapper.mapToDto(it)}
    }

    override fun postTodo(todoDto: TodoDto): TodoDto {
        val todo = todoRepository.save(TodoDtoMapper.mapToEntity(todoDto))
        return TodoDtoMapper.mapToDto(todo)
    }

    override fun deleteTodo(id : Long) {

        try{
            todoRepository.deleteById(id)
        }
        catch(e : Exception){

        }
    }
}