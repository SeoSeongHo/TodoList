package com.todo.entity
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class TodoItem (
        @Id @GeneratedValue
        var id: Long? = null,
        var todo: String,
        var isComplete: Boolean
) {

}