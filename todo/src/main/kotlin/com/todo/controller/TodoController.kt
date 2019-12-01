package com.todo.controller

import org.springframework.beans.factory.annotation.*
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@Controller
@RequestMapping("api/todo")
class TodoController (
        @Autowired private val _todoContext: todoContext
){
    @GetMapping("/")
    fun todolist() : {

    }
}