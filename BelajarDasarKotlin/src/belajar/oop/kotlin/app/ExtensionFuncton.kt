package belajar.oop.kotlin.app

import belajar.oop.kotlin.data.Mahasiswa
import belajar.oop.kotlin.data.sayHello
import belajar.oop.kotlin.data.upperName

fun main() {
    val mahasiswa = Mahasiswa ("Lisvindanu", 20)
    mahasiswa.sayHello("")
    println(mahasiswa?.upperName)
}