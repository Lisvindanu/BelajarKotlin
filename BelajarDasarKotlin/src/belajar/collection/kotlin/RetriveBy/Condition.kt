package belajar.collection.kotlin.RetriveBy

fun main(args: Array<String>) {
    val numbers = (1..20).toList()
    println(numbers.first {it > 10}) // 11
    println(numbers.last {it >= 20}) // 20
    println(numbers.firstOrNull {it >= 50}) // null
    println(numbers.find {it >= 50}) // null
    println(numbers.lastOrNull() {it >= 50}) // null
    println(numbers.findLast() {it >= 50}) // null
}