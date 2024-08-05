package belajar.kotlin.generic.app

interface CanSayHello {
    fun sayHello(name: String)
}

open class Employee

class Manager : Employee()
class VicePresident: Employee(), CanSayHello {
    override fun sayHello(name: String) {
      println("Hello $name, im Vice President")
    }
}

class Company<T>(val employee: T) where T : Employee, T: CanSayHello
class Company2<T>(val employee: T) where T : Employee
fun main() {
//    val data1 = Company(Employee()) error
    val data2 = Company2(Manager())
    val data3 = Company(VicePresident())
    //val data4 = Company("VicePresident()")//Error
}