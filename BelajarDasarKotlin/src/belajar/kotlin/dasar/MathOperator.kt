package belajar.kotlin.dasar

fun main() {
    val result1= 10 / 3
    println(result1)

    val result2= 10 + 10 / 2
    println(result2)

    val resultDecimal= 10.0 /3.0
    println(resultDecimal)

    var total: Int = 0
    val barang1 = 100
    total += barang1
    val barang2 = 200
    total += barang2
    val barang3 = 300
    total += barang3
    println("total " + total)

    total++
    println(total)
    total--
    println(total)

    val suhu = -5
    println("Suhu di antartika  $suhu  Derajat celcius")

    val sehat = true

    println("apakah dia sehat ? " + !sehat)

}