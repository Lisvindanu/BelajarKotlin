package belajar.oop.kotlin.app

import belajar.oop.kotlin.data.Car

fun main() {
    val avanza = Car("Toyota")
    avanza.year = 2015
    val almaz = Car("Wuling", "ALmaz")

    println(avanza.brand)
    println(avanza.year)
    println(almaz.brand)
    println(almaz.year)
    println(almaz.name)



}