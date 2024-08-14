package belajar.collection.kotlin.ordering

fun main(args: Array<String>) {
    val list = mutableListOf("Lisvin", "Danu", "Vr")
    val listReversed = list.reversed()
    val listAsReversed = list.asReversed()

    println(listReversed)
    println(listAsReversed)

    println("--------------------")

    list.add("Programmer")
    println(listReversed)
    println(listAsReversed)
}