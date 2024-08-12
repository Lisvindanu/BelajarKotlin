package belajar.oop.kotlin.app

import belajar.oop.kotlin.data.User

fun main() {
    val user1 = User("Lisvindanu", "Rahasia")
    val user2 = User("Nartohhhh", "Rahasia")

    user1.usernameParam = "Danu"
    user1.passwordParam = "SangatRahasia"

    println(user1.usernameParam)
    println(user1.passwordParam)


    println(user2.usernameParam)
    println(user2.passwordParam)
}