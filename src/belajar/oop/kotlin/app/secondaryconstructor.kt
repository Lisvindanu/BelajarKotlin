package belajar.oop.kotlin.app

import belajar.oop.kotlin.data.Address

fun main() {
    val address1 = Address("Jalan A", "Bandung")
    val address2 = Address("Jalan B", "Kalbar", "Indonesia")

    println(address1.street)
    println(address2.street)
}