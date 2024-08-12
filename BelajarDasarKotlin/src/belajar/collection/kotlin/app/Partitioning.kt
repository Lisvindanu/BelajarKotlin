package belajar.collection.kotlin.app

//Pada filtering by predicate, kita akan menghilangkan data yang tidak masuk kondisi filter
//Dengan filtering partition, kita akan membagi collection menjadi dua, dimana collection pertama yang masuk filtering,
// dan collection kedua yang tidak masuk filtering

/*
 Partitioning Operation
Keterangan
partition((T) -> Boolean): Pair<List<T>, List<T>>
Mempartisi collection dengan filtering sehingga menghasilkan Pair collection T
 yang masuk filter, dan collection T yang tidak masuk filter
 */

fun main() {
    val list: List<String> = listOf("Lisvindanu", "Danu", "RajaIbelis")
    val (listMatch, listNotMatch) = list.partition { it.length > 5 }

    println("ListMatch : " + listMatch)
    println("Not match : " + listNotMatch)

    val pair:Pair<List<String>, List<String>>  = list.partition { it.length > 5 } // tanpa destructuring
    println(pair)
}
