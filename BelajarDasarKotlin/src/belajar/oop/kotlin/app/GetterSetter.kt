package belajar.oop.kotlin.app

import belajar.oop.kotlin.data.BigNote
import belajar.oop.kotlin.data.Note

fun main() {
    val note = Note("Belajar Kotlin")

    println(note.title)
    note.title = ""
    println(note.title)

    val bigTitle = BigNote("belajar kotlin")
    println(bigTitle.title)
    println(bigTitle.bigTitle)
}