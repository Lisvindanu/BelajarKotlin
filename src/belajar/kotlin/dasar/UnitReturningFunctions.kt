package belajar.kotlin.dasar

fun printHello(name: String?): Unit {
    if (name == null) {
        println("tidak ada")
    } else {
        println("Hello $name")
    }
}
fun naruto(): Unit{

}
fun main() {
    printHello("Danu")
    naruto()
}