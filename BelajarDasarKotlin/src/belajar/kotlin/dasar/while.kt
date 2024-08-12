package belajar.kotlin.dasar

fun main() {
    var i = 0;

    while (i < 10) {
        println("while loop ke $i")
        i++
    }
    println("selesai perulangan pada index terakhir yaitu ${i - 1}")
}