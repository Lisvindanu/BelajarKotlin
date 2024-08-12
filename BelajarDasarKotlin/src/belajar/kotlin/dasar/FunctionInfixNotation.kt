package belajar.kotlin.dasar

infix fun String.to(type : String): String {
    if(type == "UP") {
        return this.toUpperCase()
    } else {
        return this.toLowerCase()
    }
}
fun main() {
    val result: String = "Lisvin Danu" to "LOW"
    println(result)

    1000 downTo 1
}