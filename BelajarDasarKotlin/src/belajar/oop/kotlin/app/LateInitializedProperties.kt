package belajar.oop.kotlin.app

import belajar.oop.kotlin.data.Television

fun main() {
    val television = Television()
//    println(Television.brand) ERROR karena lateinit, television tidak di inisialisasi di awal nilai properties
    television.initTelevision("Sumsang")
    println(television.brand)

    television.brand = "Panasonic"
    println(television.brand)
    //sebelum di akses, value properties harus di set

}