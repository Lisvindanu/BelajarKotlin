package belajar.kotlin.generic.app

class Contravariant<in T> {
    fun sayHello(name: T){
         println("Hello $name")
    }

   //tidak boleh m
//    fun getData(): T {
//        return data
//    }
}

fun main() {
    val contravariantAny = Contravariant<Any>()
    val contravariantString: Contravariant<String> = contravariantAny

    //contavariantString.getData() // error
    contravariantString.sayHello("Danu")
}