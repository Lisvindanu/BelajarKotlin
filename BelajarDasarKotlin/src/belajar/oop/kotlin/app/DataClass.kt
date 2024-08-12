package belajar.oop.kotlin.app

import belajar.oop.kotlin.data.Product

fun main() {
    val product = Product("Indomie", 20000, "Goreng")
    val product2 = product.copy(Category = "Sarimi")
println(product)
println(product2)

}