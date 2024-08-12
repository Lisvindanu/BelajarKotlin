package ProjectD.view

import ProjectD.Services.TodoListServiceImpl
import ProjectD.Services.TodoListServices
import ProjectD.Util.InputUtil

class TodoListView(private val todoListServices: TodoListServices)  {
    fun showTodoList()  {
        while (true) {
            todoListServices.showTodoList()

            println("Menu : ")
            println("1. tambah")
            println("2. Hapus")
            println("x. Keluar")

            val Input = InputUtil().inputString("Pilih")
            when(Input) {
                "1" -> addTodoList()
                "2" -> removeTodoList()
                "x" -> break
                else -> println("Pilihan tidak dimengerti")
            }
        }
    }

    private fun addTodoList() {
        val todo = InputUtil().inputString("Todo (x Untuk Batal)")
        if (todo != "x") {
            todoListServices.addTodoList(todo)
        }
    }

    private fun removeTodoList() {
        val number = InputUtil().inputInt("Nomor yang dihapus(x untuk batal)")
        if (number != -1) {
            todoListServices.removeTodoList(number)
        }
    }
}