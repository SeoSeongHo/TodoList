package com.todo.dto

data class TodoDto(
        var id: Long? = null,
        var todo: String,
        var isComplete: Boolean
)