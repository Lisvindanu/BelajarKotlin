package belajar.collection.kotlin.app

fun <T> displayCollection(collection: Collection<T>) {
    for (isi in collection) {
        println(isi)
    }
}

fun main() {
    displayCollection(listOf("Danu", "Lisvin"))
    displayCollection(setOf("Danu", "Lisvin"))
    displayCollection(mapOf("Danu" to "Lisvin").entries)
   // displayCollection(mapOf("Danu" to "Danu"))//Error karna map bukan turunan collection
}