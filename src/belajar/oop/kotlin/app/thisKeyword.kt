package belajar.oop.kotlin.app

import belajar.oop.kotlin.data.Ninja

fun main() {
    val Naruto = Ninja("Sasuke")
    Naruto.sayHello("Naruto",  "Konoha")
    Naruto.nameParam = "Saske"
    Naruto.sayHello2(" ", "Penghianat Konoha")
}