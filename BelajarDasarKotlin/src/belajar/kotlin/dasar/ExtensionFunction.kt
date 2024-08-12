package belajar.kotlin.dasar

fun String.hello(): String = "Hello $this"
fun String.printHello(): Unit = println("Hello $this")
fun main() {
    val name = "Lisvindanu"
    println(name.hello())
    name.printHello()
    "Lisvindanu".printHello()
}