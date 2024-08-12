package belajar.kotlin.dasar

fun toUpper(value: String): String = value.toUpperCase()
fun toLow(value: String) : String = value.toLowerCase()

fun main() {
    val toUpperCase: (String) -> String = :: toUpper
    println(toUpperCase("lisvindanu"))
    val toLowerCase: (String) -> String= :: toLow
    println(toLowerCase("LISVINDANU"))
}