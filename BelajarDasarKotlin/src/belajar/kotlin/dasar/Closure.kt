package belajar.kotlin.dasar

fun main() {
    var counter: Int = 0
    var name:String = "Lisvindanu"
    val lambdaIncrement: () -> Unit = {
        println("Lambda Increment ")
        counter++
        name = "Lambda"
    }


    val anonymousIncrement = fun() {
        println("Anonymous Function Increment")
        counter++
    }
    fun functionIncrement() {
        println("Function Increment")
        counter++
    }

    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()
    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()

    println(counter)
    println(name)
}