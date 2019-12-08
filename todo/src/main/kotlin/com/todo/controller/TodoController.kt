package com.todo.controller
import com.todo.dto.TodoDto
import com.todo.services.todoRegister.ITodoRegisterService
import com.todo.services.todoRegister.TodoRegisterService
import org.springframework.beans.factory.annotation.*
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@Controller
@RequestMapping("api/todo")
class TodoController (
        @Autowired private val todoRegisterService: ITodoRegisterService
){
    @GetMapping("/")
    fun getTodoList() : List<TodoDto>{
        return todoRegisterService.getTodoList()
    }

    @GetMapping("/{id}")
    fun getTodo(@PathVariable id : Long) : TodoDto{
        return todoRegisterService.getTodo(id)
    }

    @PostMapping("/")
    fun updateTodo(todoDto: TodoDto) : TodoDto{
        return todoRegisterService.postTodo(todoDto)
    }

    @DeleteMapping("/{id}")
    fun removeTodo(@PathVariable id : Long) {
        return todoRegisterService.deleteTodo(id)
    }
}