package belajar.oop.kotlin.app

import belajar.oop.kotlin.data.Fruit

fun main() {
    val fruit1= Fruit(100)
    val fruit2= Fruit(100)
    val fruit3 = fruit1 + fruit2
    println(fruit3)

    println(fruit3 - Fruit(10))
}