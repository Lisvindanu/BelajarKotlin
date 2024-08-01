package belajar.oop.kotlin.program

import belajar.oop.kotlin.annotations.Fancy

@Fancy(author = "Danu")
class MyApplication(val name:String, val version:Int) {
    fun info(): String = "Application $name-$version"
}