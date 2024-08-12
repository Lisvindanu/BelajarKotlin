package belajar.collection.kotlin.app

fun <T> displayIterable(iterable: Iterable<T>){
    val iterator = iterable.iterator()
    while (iterator.hasNext()) {
        val value = iterator.next()
        println(value)
    }
}

fun main() {
    displayIterable(listOf("Danu", "Lisvin", "Bin"))
    println()
    displayIterable(setOf("Danu", "Lisvin", "Bin"))
}