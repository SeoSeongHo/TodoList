package com.todo.dto.mapper

import com.todo.dto.TodoDto
import com.todo.entity.TodoItem

class TodoDtoMapper(

) {
    companion object{
        fun mapToDto(todoItem: TodoItem): TodoDto {
            return TodoDto(
                    todoItem.id,
                    todoItem.todo,
                    todoItem.isComplete
            )
        }

        fun mapToEntity(todoDto: TodoDto) : TodoItem{
            return TodoItem(
                    todoDto.id,
                    todoDto.todo,
                    todoDto.isComplete
            )
        }
    }
}