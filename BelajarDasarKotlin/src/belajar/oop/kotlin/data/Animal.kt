package belajar.oop.kotlin.data

abstract class Animal {
    abstract val name: String
    abstract fun run()
}

class Cat : Animal() {

   override val name: String = "emeng"
    override fun run() {
        println("$name Run")
    }
}
class Dog : Animal() {

    override val name: String = "Blacky"

    override fun run() {
        println("$name Run")
    }
}