package belajar.collection.kotlin.ordering

fun main(args: Array<String>) {
    val numbers: List<Int> = listOf(1,9,4,3,8,6,2,7,5,10)
    val sortedAsc = numbers.sorted()
    val sortedDesc = numbers.sortedDescending()

    println(sortedDesc)
    println(sortedAsc)
}