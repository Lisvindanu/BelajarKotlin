package belajar.collection.kotlin.app

//record 1 list 1 gabung record 1 list 2
//misal ada 3 record di list 1, dan cuman ada 2 record pada list 2, maka yang data yang
// lebih besar akan di skip. pastikan besar data sama, jika tidak maka diambil  yang paling kecil

fun main() {
    val list1: List<String> = listOf("Lisvin", "Danu", "Ganteng")
    val list2: List<String> = listOf("Programer", "Raja", "Ibelis")
//    val list2: List<String> = listOf("Programer", "Raja")

    val list3: List<Pair<String, String>> = list1.zip(list2)
    println(list3)

    val list4 = list1.zip(list2) {val1, val2 ->
        "$val1 $val2" // jadi list of string
    }
    println(list4)

}
