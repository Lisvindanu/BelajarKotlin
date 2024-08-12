package belajar.collection.kotlin.app

fun <T> displayMutableIterable(iterable: MutableIterable<T>) {
    val iterator = iterable.iterator()
    while (iterator.hasNext()) {
        val value = iterator.next()
//        iterator.remove() // Menghapus data
        println(value)
    }
}

fun main() {
    displayMutableIterable(mutableListOf("Danu", "Lisvin", "Ganteng"))
    displayMutableIterable(mutableSetOf("Danu", "Lisvin", "Ganteng"))
}