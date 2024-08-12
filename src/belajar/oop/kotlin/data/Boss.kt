package belajar.oop.kotlin.data

class Boss(val name:String) {
    inner class Employee(val name:String) {
        fun hi() {
            println("hi, my name is $name, and my boss name is ${this@Boss.name}")
        }
    }
}