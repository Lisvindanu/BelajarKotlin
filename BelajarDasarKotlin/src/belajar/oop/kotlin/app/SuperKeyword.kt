package belajar.oop.kotlin.app

import belajar.oop.kotlin.data.Rectangle

fun main() {
    val rectangle = Rectangle()
    println("Corner ${rectangle.corner}")
    println("Parent Corner ${rectangle.parentCornet}")
    rectangle.printName()
}