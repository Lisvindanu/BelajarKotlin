package belajar.oop.kotlin.app

import belajar.oop.kotlin.data.Company

//hashCode == representasi number
fun main() {
    val company1 = Company("Danu")
    val company2 = Company("danu")
    println(company1.hashCode() == company2.hashCode())
   println(company1.hashCode())
   println(company2.hashCode())


}