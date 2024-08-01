package belajar.oop.kotlin.app

import belajar.oop.kotlin.data.Boss

fun main() {
    val danu = Boss("Danu")
    val joko = danu.Employee("Pohon 1")
    val naruto = danu.Employee("Pohon 2")
   joko.hi()
   naruto.hi()
}