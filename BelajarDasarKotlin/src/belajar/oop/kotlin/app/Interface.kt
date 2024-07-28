package belajar.oop.kotlin.app

import belajar.oop.kotlin.data.Human

fun main() {
    val human = Human("Dia", null)
    human.sayHello("Aku")
    human.cekUmur(13)
    human.move()
}