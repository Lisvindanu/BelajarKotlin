package belajar.kotlin.dasar

fun main() {
    var Name:String = "Lisvindanu"
    var Umur: String = "Bentar lagi 20"
    var Alamat: String = """ 
        >Jalan Pangsuma,
        >Seluas
        >Kalbar
        >79285
        """.trimMargin(">")
    var FirstName: String = "Lisvin"
    var LastName: String = "Danu"
    var FullName: String = "$FirstName $LastName"
    var desc: String = "Total $FullName char Length = {${FullName.length}}"
    println(FullName)
    println(Name)
    println(Umur)
    println(Alamat)

    println(desc)
}