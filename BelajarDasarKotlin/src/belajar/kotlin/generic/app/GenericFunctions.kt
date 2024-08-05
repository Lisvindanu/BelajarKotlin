package belajar.kotlin.generic.app

import belajar.kotlin.generic.data.Function


fun main() {
    val function = Function("Danu")
    function.sayHello<Int>(20)
    function.sayHello<String>("Danu")
    function.sayHello(20)
    function.sayHello("Danu")


}