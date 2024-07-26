package belajar.oop.kotlin.app

import belajar.oop.kotlin.data.ExecutiveCustomer
import belajar.oop.kotlin.data.PremiumCustomer

fun main() {
    val premiumCustomer = PremiumCustomer("Lisvindanu")
    println(premiumCustomer.name)

    val executiveCustomer = ExecutiveCustomer("Danu", 500000000)
    println(executiveCustomer.name)
    println(executiveCustomer.balance)
}

