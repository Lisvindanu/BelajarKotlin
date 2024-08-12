package belajar.oop.kotlin.app

import belajar.oop.kotlin.data.Application
import belajar.oop.kotlin.data.Utilities

fun main() {
//    println(Utilities.name)
//    println(Utilities.toUpper("lisvindanu"))
    Utilities.name = "Dirubah"
    println(Utilities.toUpper("lisvindanu"))
    a()
    b()

    println(Application.toUpper("danu"))
    println(Application.Companion.toUpper("danu"))
}

fun a() {
    println(Utilities.name)
}
fun b() {
    println(Utilities.name)
}