package ProjectD.Services

interface TodoListServices {
    fun showTodoList()
    fun addTodoList(todo : String)
    fun removeTodoList(number: Int)
}