package belajar.collection.kotlin.app
//Association adalah operasi transformasi dari collection menjadi map
//Dalam beberapa operasi association, element hasil bisa menjadi key atau value

/*
 Association Operation :
associate((T) -> Pair<K, V>)
Keterangan
Merubah collection T menjadi Map<K, V> .
associateWith(T -> V)
Merubah collection T menjadi Map<T, V> .
associateBy(T -> K)
Merubah collection T menjadi Map<K, T> .

 */

fun main() {
    val list: List<String> = listOf("Lisvin", "Danu","Tampan")

    val map: Map<String, Int> = list.associate { Pair(it, it.length) }
    println(map)

    val map2: Map<String, Int> = list.associateWith {  it.length }
    println(map2)

    val map3: Map<Int, String> = list.associateBy { it.length }
    println(map3)
}