package belajar.kotlin.dasar

fun kaliDua(a:Int):Int = a * 2

fun sapa(name:String): Unit = println("Halo $name")

fun main() {
    val result = kaliDua(10)
    println(result)
    sapa("Lisvindanu")
}