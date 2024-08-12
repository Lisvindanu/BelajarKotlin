package belajar.kotlin.dasar

fun main() {
    var array = arrayOf("Lisvin", "Danu", "Ganteng")

    var total = 0
    for (nama in array ) {
        println(nama)
        total++
    }
    print("total perulangan =  $total")

    val ukuranArray = array.size -1
    for (i in 0..ukuranArray) {
        println("index $i = ${array.get(i)}")
    }
}