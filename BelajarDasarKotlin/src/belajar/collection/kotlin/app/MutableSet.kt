package belajar.collection.kotlin.app

import belajar.collection.kotlin.data.Person

fun main() {
    val mutableSet: MutableSet<Person> = mutableSetOf()
    mutableSet.add(Person("Danu"))
    mutableSet.add(Person("Lisvin"))
    mutableSet.add(Person("Danu"))
    mutableSet.add(Person("King"))

    println(mutableSet.size)
    for (person in mutableSet) {
        println(person)
    }

    val mutableSetString = mutableSetOf("Danu", "Lisvin", "Danu")
    println(mutableSetString.size)
}