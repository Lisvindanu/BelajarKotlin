package belajar.oop.kotlin.data

class Laptop(val name:String) {
}

open class HandPhone(val name: String) {
    override fun toString(): String {
        return name
    }
}

class SmarthPhone(name: String, val os:String ) : HandPhone(name) {
    override fun toString(): String {
        return "Smarthphone : $name, OS: $os"
    }
}