package belajar.oop.kotlin.app

import belajar.oop.kotlin.data.SuperTeacher
import belajar.oop.kotlin.data.Teacher

fun main() {
    val teacher = SuperTeacher("Lisvin")
    println(teacher.name)
    teacher.test()
}

/**
 *  public
 * Jika tidak menyebutkan, maka secara otomatis visibility modifiers nya adalah public, yang artinya bisa diakses dari manapun
 * private
 * Artinya hanya bisa diakses di tempat deklarasinya
 * protected
 * Artinya hanya bisa diakses di tempat deklarasi, dan juga turunannya
 * internal
 * Artinya hanya bisa diakses di module/project yang sama.
 *
 * */