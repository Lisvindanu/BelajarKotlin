package belajar.collection.kotlin.app

fun <T> displayMutableCollection(collection: MutableCollection<T>) {
    for (elements in collection) {
        println(elements)
    }
}

fun main() {
//    displayMutableCollection(listOf("Danu", "Lisvin")) // ERROR
    displayMutableCollection(mutableListOf("Mutable List of " + "Danu", "Lisbin"))
//    displayMutableCollection(setOf("Danu", "Lisvin")) //Error
    displayMutableCollection(mutableSetOf("Mutable Set of " +"Lisvin", "Danu"))
    displayMutableCollection(mutableMapOf("Mutable Map of " +"Danu" to "Lisvin").entries)
//    displayMutableCollection(MapOf("Danu" to "Lisvin").entries)// Error


   val mutableList = mutableListOf("Ginger", "Jahe")
    displayMutableCollection(mutableList)
    mutableList.add("Kencur")
    displayMutableCollection(mutableList)
    mutableList.removeAll(mutableList)
    displayCollection(mutableList)
}