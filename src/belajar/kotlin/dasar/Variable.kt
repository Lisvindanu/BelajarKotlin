package belajar.kotlin.dasar/*
    Kotlin mendukung 2 jenis variable ; Mutable(bisa diubah) Imutable(gabisa diubah (final))
    Mutable menggunakan var
    Imutable menggunakan val

    Deklarasi variable
    val/var namaVariable : TipeData = data
 */

const val APP = "Belajar Kotlin"
const val VER = "0.0.1"
fun main() {
    var firstName = "Lisvin"
    var akhirNama = "Danu"
    val age = 20

    val lastName = "Danu"
    println(firstName)
    println(akhirNama)
    akhirNama= "Ipin"
    println(age)
    println(akhirNama)

    var bolehNull: String? = "AkuGanteng"
    bolehNull = null
    /*error karena bolehNull bernilai null
    println(bolehNull.length)
     */

    //solusi
    println(bolehNull?.length)
    bolehNull = "Aku"
    println(bolehNull)
    print("$APP : $VER")
}