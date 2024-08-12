package belajar.oop.kotlin.app

import belajar.oop.kotlin.data.Student
import belajar.oop.kotlin.data.Student1

fun main() {
    val student = Student1("Danu", 20)
//    student.sayHello("Bro")

    var result: String = student.let {
        "My name Name ${it.name}, and my Age ${it.age}"
    }
    println(result)

    val result2: String = student.run {
        "My name Name ${this.name}, and my Age ${this.age}"

    }
    println(result2)

    val result3: Student1 = student.apply {
        "My name Name ${this.name}, and my Age ${this.age}"
    }
    println(result3)

    var result4: Student1 = student.also {
        "My name Name ${it.name}, and my Age ${it.age}"
    }
    println(result4)

    val result5: String = with(student) {
        "My Name is ${this.name}, and my Age ${this.age}"

    }
    println(result5)
}