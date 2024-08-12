package belajar.oop.kotlin.data

//inline class hanya boleh memiliki 1 property

inline class Token(val value:String) {
    fun toUpper():String = value.toUpperCase()
}