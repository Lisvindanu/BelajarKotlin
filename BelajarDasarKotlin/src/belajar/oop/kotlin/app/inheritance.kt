package belajar.oop.kotlin.app

import belajar.oop.kotlin.data.Manager
import belajar.oop.kotlin.data.VicePresident

fun main() {
    val manager = Manager("Lisvin")
    manager.sayHello("Eko")

    val VP = VicePresident("Gojo")
    VP.sayHello("satoru")
}