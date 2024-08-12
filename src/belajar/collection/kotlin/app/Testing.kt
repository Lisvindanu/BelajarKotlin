package belajar.collection.kotlin.app

/*
Filtering testing adalah operation yang bisa digunakan untuk mengecek isi data dari collection
Hasil dari filtering testing adalah boolean, dimana true jika sesuai kondisi, dan false jika tidak sesuai kondisi
 */

/*
 any((T) -> Boolean) : Boolean
Mengecek apakah minimal ada satu data sesuai dengan kondisi
none((T) -> Boolean) : Boolean
Mengecek apakah tidak ada satupun data sesuai dengan kondisi
all((T) -> Boolean) : Boolean
Mengecek apakah semua data sesuai dengan kondisi
any()
Apakah collection memiliki data
none()
Apakah collection tidak punya data

 */

fun main() {
    val list: List<String> = listOf("Lisvindanu", "Lisvin", "Danu")
    println(list.any{it.length > 5})
    println(list.none{it.length < 11})
    println(list.all{it.length > 5})
    println(list.any())
    println(list.none())

}