package belajar.oop.kotlin.app

import belajar.oop.kotlin.data.Minus
import belajar.oop.kotlin.data.Modulo
import belajar.oop.kotlin.data.Operation
import belajar.oop.kotlin.data.Plus

fun operation (value1: Int, value2: Int, operation : Operation) : Int {
    return when(operation) {
       is Plus -> value1 + value2
        is Minus -> value1 - value2
        is Modulo -> value1 % value2

    }
}

fun main() {
    println(operation(10,5, Minus()))
    println(operation(10,5, Plus()))
    println(operation(10,3, Modulo()))
}