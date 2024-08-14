package belajar.collection.kotlin.app

fun main() {
    val list = listOf("Lisvin", "Danu", "Lisvindanu")
    println(list.getOrNull(9))
    println(list.getOrElse(10) {index -> "tidak ada"})
    println(list.getOrElse(2) {index -> "tidak ada"})
    println(list.subList(0, 2))

    val sortedList = list.sorted()
    println(sortedList.binarySearch("Lisvindanu"))
    println(sortedList.binarySearch("Danu"))
    println(sortedList.binarySearch("Lisvin")) // return = index

    val numbers = listOf(1,1,2,2,3,3,4,4,5,5)
    println(numbers.indexOf(2))
    println(numbers.lastIndexOf(2))
    println(numbers.indexOfFirst { it > 3 })
    println(numbers.indexOfLast { it > 3 })

}