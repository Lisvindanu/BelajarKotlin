package ProjectD.App

import ProjectD.Repository.TodoListRepository
import ProjectD.Repository.TodoListRepositoryImpl
import ProjectD.Services.TodoListServiceImpl
import ProjectD.Services.TodoListServices
import ProjectD.view.TodoListView

fun main(args: Array<String>) {
    val todoListRepository: TodoListRepository = TodoListRepositoryImpl()
    val todoListServices : TodoListServices = TodoListServiceImpl(todoListRepository)
    val todoListView : TodoListView = TodoListView(todoListServices)

    todoListView.showTodoList()
}