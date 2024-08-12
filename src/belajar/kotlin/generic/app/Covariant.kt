package belajar.kotlin.generic.app

class Covariant <out T>(val data: T) {
    fun data(): T {
        return data
    }

    //tidak boleh membuat func dengan input generic covariant
//    fun setData(param: T) {
//        data = param
//    }
}

fun main() {
    val covariantString: Covariant<String> = Covariant("Danu")
    val covariantAny: Covariant<Any> = covariantString

    println(covariantAny.data)
//    covariantAny.setData(100) tidak boleh
}