package ProjectD.Entity

class TodoList (private var paramTodo : String = ""){

   var todo: String = paramTodo
       get()  {
           println("Call getTodo")
           return field
       }
       set(value) {
          println("call setTodo")
           if (value.isNotBlank()) {
               field = value
           } else {
               println("todo can't filled blank")
           }
       }
}