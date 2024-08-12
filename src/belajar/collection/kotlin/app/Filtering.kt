package belajar.collection.kotlin.app

/*
Filtering by Predicate

Filtering adalah salah satu operasi collection yang sangat popular
Di kotlin, filtering bisa menggunakan predicate berupa lambda yang berisi kondisi filter nya
Jika return dari predicate tersebut true, maka data di terima, jika false maka data dibuang
 */

/*
 Filtering Operation
Keterangan
filter((T) -> Boolean)
Melakukan filtering terhadap collection
filterIndexed((index, T) -> Boolean)
Melakukan filtering terhadap collection, dengan tambahan informasi index
filterNot((T) -> Boolean)
Kebalikan dari filter((T) -> Boolean)
filterIsInstance<T>()
Mengambil hanya data instant dari T
filterNotNull()
Mengambil hanya data yang tidak null

 */

fun main() {
    val list1 = listOf("Lisvin", "Danu", "tampan")
    val list2 = list1.filter {it.length >=5}
    println(list2)
    println(list1)
    val list3 = list1.filterIndexed{index, value->index%2==0}
    println(list3)

    val list4: List<Any?> = listOf(null, 1, "Lisvin", "Danu", 22, null)
    val listString = list4.filterIsInstance<String>()
    println(listString)
    val listInt = list4.filterIsInstance<Int>()
    println(listInt)
    val listNotNull = list4.filterNotNull()
    println(listNotNull)
}