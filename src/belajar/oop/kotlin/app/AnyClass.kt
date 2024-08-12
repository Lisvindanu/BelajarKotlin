package belajar.oop.kotlin.app

import belajar.oop.kotlin.data.HandPhone
import belajar.oop.kotlin.data.SmarthPhone

fun main() {
    val smarthPhone = SmarthPhone("Samsung", "Android")
    println(smarthPhone.toString())
    println(smarthPhone.hashCode())
}