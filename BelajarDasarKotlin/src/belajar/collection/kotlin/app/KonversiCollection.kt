package belajar.collection.kotlin.app

fun main() {
    val array = arrayOf(3, 78, 20, 81, 22, 212, 9)
    val range = 1..100

    val list = array.toList()
    val set = array.toSet()

    val mutableSet = range.toMutableSet()
    val mutableList = range.toMutableList()

    val listToMutableSet = list.toMutableList()
    val setToMutableList = set.toMutableList()

    val sortedSet = array.toSortedSet()
    println(sortedSet)

}