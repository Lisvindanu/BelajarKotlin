package belajar.oop.kotlin.app

import belajar.oop.kotlin.data.Action

fun fireAction(action: Action) {
    action.action()
}

class SampleAction : Action {
    override fun action() {
        println("this is sample action")
    }
}

fun main() {
    fireAction(SampleAction())
    fireAction(object : Action {
        override fun action() = println("Action one")
    })

    fireAction(object : Action {
        override fun action() {
            println("Action two")
        }
    })
}