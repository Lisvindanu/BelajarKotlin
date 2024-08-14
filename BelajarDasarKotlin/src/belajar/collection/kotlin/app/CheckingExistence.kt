package belajar.collection.kotlin.app

fun main(args: Array<String>) {
    val numbers = (1..100).toSet()
    println(numbers.contains(5))
    println(numbers.containsAll(listOf(3,19,100)))
    println(numbers.containsAll(listOf(3,19,1000))) //false karna gaada 1000

    println(numbers.isEmpty()) // false
    println(numbers.isNotEmpty()) // tru
}