package belajar.collection.kotlin.app

fun main() {
    val list: List<String> = listOf("Lisvin", "Danu", "Gamer")

//    val temp = mutableListOf<String>()
//    for (value in list) {
//        temp.add(value.toUpperCase())
//    } cara manual

//    val list2 = list.map {
//        value -> value.toUpperCase()
//    }

    val list2 = list.map { it.toUpperCase()}
    println(list2)

    val set1 = setOf("Lisvin", "Danu", "RajaIbelis")
    val set2 = set1.map { it.toLowerCase() }
    println(set2)

    val names = listOf("Lisvin", "Jiji", "Oji", "Baka")
    val namesGanjil = names.mapIndexedNotNull {index, name ->
        if(index % 2 == 0 )  null
        else name
    }
    println(namesGanjil)

    val numbers = (1..100).toList()
    val ganjil = numbers.mapNotNull {
        if(it % 2 == 0) null
        else it
    }
    println(ganjil)
}