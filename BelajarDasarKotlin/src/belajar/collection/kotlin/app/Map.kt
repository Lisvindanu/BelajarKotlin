package belajar.collection.kotlin.app

fun main() {
    val map: Map<String, String> = mapOf(
        "Danu" to "Lisvin",
        Pair("A", "Mis")
    )



    println("keys adalah " + map.keys)
    println("values adalah " + map.values)
    println("entries adalah " + map.entries)
    for ((key, value) in map) {
//        println(key)
//        println(value)
        println("$key to $value")
    }
}