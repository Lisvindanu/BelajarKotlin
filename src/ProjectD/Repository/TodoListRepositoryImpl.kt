package ProjectD.Repository

import ProjectD.Entity.TodoList

class TodoListRepositoryImpl : TodoListRepository {
   private val todoList: Array<TodoList?> = arrayOfNulls(10)
    private var index:Int = 0

    fun isFun() : Boolean {
        for(todo in todoList) {
            if(todo == null) {
                return false
            }
        }
        return true
    }
    override fun getAll(): Array<TodoList> {
        return todoList.filterNotNull().toTypedArray()
    }

    override fun add(todoList: TodoList) {
        if (index < this.todoList.size) {
            this.todoList[index] = todoList
            index ++
        } else {
            print("TodoList penuh")
        }
    }

    override fun remove(number: Int): Boolean {
        if (number in 0 until index && todoList[number] != null) {
            for(i in number until index - 1) {
                todoList[i] = todoList [i + 1]
            }
            todoList[index - 1] = null
            index--
            return true
        }
        return false
    }

}