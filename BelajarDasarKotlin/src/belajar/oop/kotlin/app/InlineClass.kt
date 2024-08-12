package belajar.oop.kotlin.app

import belajar.oop.kotlin.data.Token

fun main() {
    val token = Token("ini token")
    println(token.value)
    println(token.toUpper())
}