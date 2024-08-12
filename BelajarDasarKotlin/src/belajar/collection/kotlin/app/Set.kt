package belajar.collection.kotlin.app

import belajar.collection.kotlin.data.Person

fun main() {
    val set: Set<Person> = setOf(
        Person("Lisvin"), Person("Danu"), Person("Lisvin"), Person("Danu"), Person("Danu"), Person("King")
    )
    println(set.size)
    println(set.contains(Person("Lisvin")))

    for (person in set) {
        println(person)
    }
}