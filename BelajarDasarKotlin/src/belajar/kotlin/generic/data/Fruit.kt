package belajar.kotlin.generic.data

class Fruit(val name: String, val quantity: Int) : Comparable<Fruit> {
    override fun compareTo(other: Fruit): Int {
      return quantity.compareTo(other.quantity)
    }

//    override fun compareTo(other: Fruit): Int = other.quantity.compareTo(quantity) bisa gini jga
}