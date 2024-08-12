package ProjectD.Repository

import ProjectD.Entity.TodoList

interface TodoListRepository {
    fun getAll(): Array<TodoList>
    fun add(todoList: TodoList)
    fun remove(number: Int): Boolean
}