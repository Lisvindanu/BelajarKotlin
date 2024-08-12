package belajar.collection.kotlin.app

fun main() {
    listOf("Lisvin", "Danu", "Ganteng").forEach {
        println(it)
    }
    mutableSetOf("Lisvin", "Danu", "Ganteng").forEachIndexed { index, value ->
        println("$index : $value")
    }
}