package belajar.kotlin.generic.app

import belajar.kotlin.generic.data.Fruit

fun main() {
    val fruit1 = Fruit("Apple", 10)
    val fruit2 = Fruit("Apple", 10)

    println(fruit1 > fruit2)
    println(fruit1 >= fruit2)
    println(fruit1 < fruit2)
    println(fruit1 <= fruit2)
}