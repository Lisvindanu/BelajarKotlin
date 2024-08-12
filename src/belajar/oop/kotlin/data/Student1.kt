package belajar.oop.kotlin.data

class Student1(val name: String, val age:Int) {
    fun sayHello(name: String): Unit {
        println("Hello $name, my name is ${this.name} and my age is $age")

    }
}