package belajar.oop.kotlin.app

import belajar.oop.kotlin.data.Delegate
import belajar.oop.kotlin.data.MyBase
import belajar.oop.kotlin.data.MyBaseDelegate

fun main() {
    val base = MyBase()
    base.sayHello("Danu")

    val baseDelegate = MyBaseDelegate(base)
    baseDelegate.sayHello("Joko")
    baseDelegate.sayGoodBye("Ipin")

    val delegate = Delegate(base)
    delegate.sayHello("Hola")

    val delegate1 = Delegate(base)
    delegate1.sayGoodBye("l")
}