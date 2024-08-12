package belajar.oop.kotlin.app

import belajar.oop.kotlin.Exception.ValidationException


fun validateAndSayHello(name:String) {
    if(name.isBlank()) {
        throw ValidationException("Name is Blank")
    } else {
        println("Hello $name")
    }
}
fun main() {
    try {
        validateAndSayHello("Danu")
        validateAndSayHello("")
    } catch (e: ValidationException) {
        println("Error with message ${e.message}")
    } catch (e: NullPointerException) {
        println("Error with message ${e.message}")
    } finally {
        println("Program selesai")

    }
}