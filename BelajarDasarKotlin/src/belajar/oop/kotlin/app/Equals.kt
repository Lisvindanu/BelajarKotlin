package belajar.oop.kotlin.app

import belajar.oop.kotlin.data.Company

/**
 * Di Kotlin, semua objek bisa dibandingkan menggunakan operasi == atau !=
 * Saat kita membandingkan objek menggunakan operasi == atau !=, sebenarnya Kotlin akan menggunakan function equals milik class Any
 * Untuk mengubah cara membandingkannya, kita bisa meng-override function equals milik class Any
 *
 */

fun main() {
    val company1 = Company("Danu")
    val company2 = Company("Danu")
    println(company1 == company2)
    println(company1 == company1)
    println(company2 == company2)

    //jadi sama karna yang di bandingkan objek nya itu si var nama bukan si nilai objek

}