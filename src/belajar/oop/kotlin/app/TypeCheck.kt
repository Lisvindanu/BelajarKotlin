package belajar.oop.kotlin.app

import belajar.oop.kotlin.data.HandPhone
import belajar.oop.kotlin.data.Laptop
import belajar.oop.kotlin.data.SmarthPhone

fun printObject(any: Any) {
    if (any is Laptop) {
        println("Laptop With Name : ${any.name}")
    }else if(any is HandPhone) {
        println("HandPhone With Name : ${any.name}")
    }else if(any is SmarthPhone)
    {
        println("HandPhone With Name : ${any.name} ${any.os}")
    }
        else {
    println(any)
    }
}

fun printObjectWithWhen(any: Any) {
    when (any) {
        is Laptop -> println("Laptop With Name : ${any.name} menggunakan when")

        is HandPhone -> println("HandPhone With Name : ${any.name} menggunakan when")

        is SmarthPhone -> println("HandPhone With Name : ${any.name} ${any.os} menggunakan when")

        else -> println(any)
    }
}

fun printString(any: Any) {
    //not safe with as, prefer use when
    //if using "as?" will be nullable.
    val value = any as? String
    println(value)
}fun printStringSafe(any: Any) {

    val value: String? = any as? String
    println(value)
}


fun main() {
    printStringSafe("Danu")
    printStringSafe(1)

    printString("Lisvin")
    printString(1)
//    printString(1) error menggunakan kata kunci as karna value = any as String tapi disini mencoba print Int
    printObject("Lisvindanu")
    printObject(1)
    printObject(Laptop("Legion 5"))
    println(HandPhone("Mi 11t Pro" ))
    println(SmarthPhone("Iphone 11", "IOS 17" ))
    printObjectWithWhen(Laptop("Legion 5"))
    printObjectWithWhen(HandPhone("Mi 11t Pro" ))
    printObjectWithWhen(SmarthPhone("Iphone 11", "IOS 17" ))
}