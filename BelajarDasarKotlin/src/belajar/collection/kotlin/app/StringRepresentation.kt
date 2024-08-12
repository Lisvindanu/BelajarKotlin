package belajar.collection.kotlin.app
//String Representations adalah operasi
// transformasi untuk mengubah collection menjadi string

/*
 joinToString(separator, prefix, suffix)
Mengubah collection menjadi string dengan separator, prefix dan suffix

joinToString(separator, prefix, suffix, transform)
Mengubah collection menjadi string dengan separator, prefix dan suffix,
 namun akan diubah dalam transform terlebih dahulu

joinTo(Appendable, separator, prefix, suffix, transform)
Sama seperti joinToString, namun string ditambahkan ke Appendable

 */

fun main() {
    val names: List<String> = listOf("Lisvin", "Danu", "Tampan")
    val string1: String = names.joinToString (" ", "|", "|")
    println(string1)

    val string2: String = names.joinToString (" ", "|", "|") {
        it.toUpperCase()
    }
    println(string2)

    val builder = StringBuilder()
    names.joinTo(builder, " ", "|", "| ")
    names.joinTo(builder, " ", ">", "<")
    names.joinTo(builder, " ", "@", "@")
    val string3 = builder.toString()
    println(string3)

    val numbers: List<Int> = (1..10).toList()
    println(numbers.joinToString ())

}