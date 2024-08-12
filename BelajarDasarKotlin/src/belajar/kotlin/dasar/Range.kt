package belajar.kotlin.dasar

fun main() {
//    val range = 1..1000
//    println(range.count())
//    println(range.contains(999))
//    println(range.contains(9199))
//    println(range.first)
//    println(range.last)
//    println(range.step)
    val range = 1000 downTo 1 step 2
        println(range.count())
    println(range.contains(999))
    println(range.contains(9199))
    println(range.first)
    println(range.last)
    println(range.step)
}