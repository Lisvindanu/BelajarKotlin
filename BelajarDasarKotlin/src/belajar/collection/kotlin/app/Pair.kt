package belajar.collection.kotlin.app

fun main() {
    val pair1: Pair<String, String> = Pair("Lisvin", "Danu")
    println(pair1.first)
    println(pair1.second)

    val pair2: Pair<String, String> = "Danu" to "Lisvin"
    println(pair2.first)
    println(pair2.second)
}