package belajar.collection.kotlin.app

/*
Untuk mengambil sebagian element di collection, selain menggunakan slice,
kita juga bisa menggunakan operator take dan drop
 */

fun main() {
    val chars: List<Char> = ('a'..'z').toList()

    println(chars.take(3))
    println(chars.takeLast(3))
    println(chars.takeWhile { it < 'f' })
    println(chars.takeLastWhile { it > 'w' })

    println(chars.drop(3))
    println(chars.dropLast(3))
    println(chars.dropWhile { it < 'f' })
    println(chars.dropLastWhile { it > 'f' })

}