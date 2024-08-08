package belajar.kotlin.dasar

fun main() {
    var DonArray = arrayOf("vin", "flamingo")

    DonArray += "M"

    println(DonArray.joinToString())
}