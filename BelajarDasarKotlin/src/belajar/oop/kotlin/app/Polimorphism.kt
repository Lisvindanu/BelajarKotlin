package belajar.oop.kotlin.app


import belajar.oop.kotlin.data.Employee
import belajar.oop.kotlin.data.Manager
import belajar.oop.kotlin.data.VicePresident

fun main() {
    var employee :Employee = Employee("Danu")
    employee.sayHello("Budi")

    employee = Manager("Danu")
    employee.sayHello("Budi")
    employee = VicePresident("Danu")
    employee.sayHello("Budi")
}