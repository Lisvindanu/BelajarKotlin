package belajar.kotlin.dasar

fun main(args: Array<String>) {
    fun factorialLoop(value:Int): Int {
        var result = 1
        for(i in value downTo 1) {
            result *= i
        }
        return result
    }
    println(factorialLoop(5))
}