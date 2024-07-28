package ProjectD.Services

import ProjectD.Entity.TodoList
import ProjectD.Repository.TodoListRepository

class TodoListServiceImpl  (private val todoListRepository: TodoListRepository) : TodoListServices{
    override fun showTodoList() {
        val model = todoListRepository.getAll()
        println("TodoList")
       for((index, todoList) in model.withIndex()) {
           val no = index + 1
           if(todoList != null) {
               println("$no.${todoList.todo}")
           }
        }
    }

    override fun addTodoList(todo: String) {
       val todoList = TodoList(todo)
        todoListRepository.add(todoList)
        print("Berhasil menambah todo : $todo")
    }

    override fun removeTodoList(number: Int) {
        val success = todoListRepository.remove(number)
        when {
            success -> println("Sukses menghapus todo : $number")
            else -> println("gagal")
        }
    }


}