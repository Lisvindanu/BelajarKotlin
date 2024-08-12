package belajar.collection.kotlin.app

/*
Di kotlin, ada operator extension function plus dan minus untuk collection
Parameter pertama adalah collection, dan parameter selanjutnya bisa collection atau element,
 dan akan menghasilkan collection baru
 */

/*
 plus(element)
Membuat collection baru dengan menambahkan element
plus(collection)
Membuat collection baru dengan menambahkan collection
minus(element)
Membuat collection baru dengan menghapus element
minus(collection)
Membuat collection baru dengan menghapus collection

 */

fun main() {
    val list1 = listOf("lisvin", "Danu", "Tampan")
    val list2 = list1 + "Programmer"
    println(list2)
    val list3 = list1 + listOf("Ingin", "Jualan", "Ayam")
    println(list3)
    val list4 = list1 - "lisvin"
    println(list4)
    val list5  = list1 - listOf("Lisvin", "GAhahaah")
    println(list5)

    val map1 = mapOf("a" to "Lisvin", "b" to "Danu")
    val map2 = map1 + ("c" to "Tampan")
    println(map2)
    val map3 = map1 - mapOf("a" to "Lisvin", "b" to "Danu")
    println("map 3 : " + map3)
    val map4 = map1 - "a"
    println("map 4 : " + map4)
}