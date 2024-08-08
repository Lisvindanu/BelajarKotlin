package belajar.collection.kotlin.app

fun main() {
    val mutableList: MutableList<String> = mutableListOf()
    mutableList.add("Lisvin")
    mutableList.add("Danu")
    mutableList.add("RajaIblis")

//    mutableList.set(0, "Lisvinn")
//    mutableList[2] = "King"

//    mutableList.remove("Danu")

//    println(mutableList[0])
//    println(mutableList[1])
//    println(mutableList[2])

    for(value in mutableList) {
        println(value)
    }
}