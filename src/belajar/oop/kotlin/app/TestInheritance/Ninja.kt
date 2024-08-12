package belajar.oop.kotlin.app.TestInheritance

open class Ninja(protected var chakra: String = "", protected var user: String = "") {
    fun Chakra(): String {
        return chakra
    }

    fun User(): String {
        return user
    }
}
