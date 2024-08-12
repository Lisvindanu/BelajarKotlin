package belajar.oop.kotlin.app

import belajar.oop.kotlin.data.Person

fun main() {
    val lisvin = Person()
    val danu = Person()

    danu.firstName = "Lisvindanu"
//    lisvin.middleName = "HALO"

    println(danu.firstName)
    println(lisvin.middleName)
}