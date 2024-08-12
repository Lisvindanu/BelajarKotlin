package belajar.collection.kotlin.app

/*
Slice adalah operator yang digunakan untuk mengambil sebagian element yang ada di collection yang
sesuai dengan parameter range

 operator : slice(range)
Mengambil sebagian element yang ada di collection sesuai dengan index range

 */

fun main() {
    val list1 = (0..100).toList()
    val list2 = list1.slice(0..50)
    val list3 = list1.slice(0..100 step 2)
    val list4 = list1.slice(100 downTo 0 step 2)
    println(list1)
    println(list2)
    println(list3)
    println(list4)
//    println(list2.lastIndex)
}
