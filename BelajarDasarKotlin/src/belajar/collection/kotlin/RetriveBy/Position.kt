package belajar.collection.kotlin.RetriveBy

fun main(args: Array<String>) {
    val set = setOf("Lisvin", "Danu", "Ganteng")
    println(set.first())
    println(set.last())
    println(set.elementAt(1))
    println(set.elementAtOrNull(10))
    println(set.elementAtOrElse(10) {"Tidak ada data pada set"})
    println(set.elementAtOrElse(2) {"Tidak ada data pada set"})
}