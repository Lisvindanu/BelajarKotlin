package belajar.oop.kotlin.app

import belajar.oop.kotlin.data.Rectangle
import belajar.oop.kotlin.data.Shape
import belajar.oop.kotlin.data.Triangle

fun main() {

    val shape = Shape()
    println(shape.corner)
    val shape2 = Rectangle()
    println(shape2.corner)
    val shape3 = Triangle()
    println(shape3.corner)

}