package belajar.oop.kotlin.app

import belajar.oop.kotlin.data.Boss
import belajar.oop.kotlin.data.Game
import belajar.oop.kotlin.data.Login
import belajar.oop.kotlin.data.MinMax

fun minMax(val1 : Int, val2: Int): MinMax {
    return when {
        val1 > val2 -> MinMax(val2, val2)
        else -> minMax(val1 , val2)
    }
}

fun login(login:Login, callback: (Login)-> Boolean):Boolean {
    return  callback(login)
}

fun main() {
    val game = Game("Game kotlin", 100_000)
    val (name, price) = game
    println(name)
    println(price)
//
//    val result = minMax(10, 100)
//    val min= result.min
//    val max= result.max

    val(min, max) = minMax(10, 100)
    println(min)
    println(max)

    val login = Login("Danu","Rahasia")
//    login(login) {
//        login (login){login ->
//            login.username == "Danu" && login.password == "Rahasia"
//        }
//    }

    login(login) {(username, password) ->
        username == "Danu" && password == "Rahasia"
    }



}