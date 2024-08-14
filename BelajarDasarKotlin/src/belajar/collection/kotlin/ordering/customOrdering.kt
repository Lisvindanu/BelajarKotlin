package belajar.collection.kotlin.ordering

import belajar.collection.kotlin.data.Fruit

fun main() {
    val fruits = listOf(Fruit("Apple", 10),
        Fruit("Banana", 20),Fruit("Pineapple", 7))

//    println("Ascending Name sorted" + fruits.sortedBy { it.name })
//    println("Descending Name sorted" + fruits.sortedByDescending { it.name })
//
//    println("Ascending Quantity sorted" + fruits.sortedBy { it.quantity })
//    println("Descending Quantity sorted" + fruits.sortedByDescending { it.quantity })

    println(
        fruits.sortedWith(Comparator
            ({ fruit1, fruit2 ->
            fruit1.quantity.compareTo(fruit2.quantity) }
            )
        )
    )

    fruits.sortedWith(compareBy({it.quantity}))
//    fruits.sortedBy {it.quantity}
//    println(fruits.sortedBy { it.quantity })
}