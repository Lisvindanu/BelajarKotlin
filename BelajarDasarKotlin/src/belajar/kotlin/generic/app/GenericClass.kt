package belajar.kotlin.generic.app

import belajar.kotlin.generic.data.MyData

fun main() {
    val myDataString: MyData<String, Int> = MyData<String, Int>("Danu", 100)
    myDataString.printlnData()

    val myDataInt = MyData(10, "Danu")

    myDataInt.printlnData()

}