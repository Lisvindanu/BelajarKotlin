package belajar.oop.kotlin.app

import belajar.oop.kotlin.data.Application

typealias App = Application
typealias Aplikasi = Application
typealias App2 = belajar.oop.kotlin.data2.Application

typealias StringSupplier = () -> String

fun sayHello(supplier: StringSupplier){
    println("Hello ${supplier()}")
}

fun main() {
    val app = App ("Kotlin app")
    val aplikasi = App ("Kotlin app")
    val app2 = App2("kotlin app v2")

    sayHello { "Danu" }
}