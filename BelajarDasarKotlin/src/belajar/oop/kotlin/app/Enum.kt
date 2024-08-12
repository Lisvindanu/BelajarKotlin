package belajar.oop.kotlin.app

import belajar.oop.kotlin.data.Gender

fun main() {
    val man = Gender.MALE
    val woman = Gender.FEMALE
    val allGenders: Array<Gender> = Gender.values()

    val manFromString = Gender.valueOf("MALE")
    val womanFromString = Gender.valueOf("FEMALE")

    println(man)
    println(woman)
    println(allGenders.toList())
    man.showDescrioption()
    woman.showDescrioption()
}