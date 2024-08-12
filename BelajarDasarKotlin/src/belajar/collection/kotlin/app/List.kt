package belajar.collection.kotlin.app

fun main() {
    val list: List<String> = listOf("Danu", "Lisvin", "Don quoite")
    println(list.get(1))
    println(list[0])
    println(list[2])
    println(list.indexOf("Don quoite"))
    println(list.contains("Danu"))
    println(list.contains("Tidak ada"))
    println(list.containsAll(listOf("Duke", "Lisvin", "Don", "Duke")))
    println(list.containsAll(listOf("Danu", "Lisvin", "Don quoite")))
    println(list.isEmpty())
    println(list.isNotEmpty())
}