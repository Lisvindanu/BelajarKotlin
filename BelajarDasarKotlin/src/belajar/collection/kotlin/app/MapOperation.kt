package belajar.collection.kotlin.app

fun main() {
val map = mapOf("a" to "Lisvin",
    "b" to "Danu",
    "c" to "Lisvindanu")
    println(map.get("a"))
    println(map.get("tidak ada"))
    println(map.getValue("a"))
    println(map.getOrElse("tidak ada") {"ups gaada data"})
    println(map.filter { entry -> entry.value.length > 5  })
    println(map.filterKeys { it != "b" })
    println(map.filterValues { it.length < 5 })
    println(map.filterValues { it.length > 5 })
//    println(map.getValue("tidak ada"))exception
}