package belajar.oop.kotlin.data
//wajib menggunakan open pada sebuah class agar bisa di override
open class Employee (val name: String) {
    open fun sayHello(name: String) {
        println("Hello $name, My name is ${this.name}")
    } open fun sayHello1(name: String) {
        println("Hello $name, My name is ${this.name}")
    }
}

open class Manager(name: String) : Employee(name) {
   //sifatnya open jika sudah override yang awal, tetapi bisa dijadikan final
    // untuk kelas yang menginheritance lagi
    override fun sayHello(name : String) {
        println("Hello $name, My name is Manager ${this.name}")
    }
    final override fun sayHello1 (name : String) {
        println("Hello $name, My name is Manager ${this.name}")
    }

}

class SuperManager(name: String) : Manager(name) {
    override fun sayHello(name : String) {
        println("Hello $name, My name is Manager ${this.name}")
    }
//    override fun sayHello1 (name : String) {
//        println("Hello $name, My name is Manager ${this.name}")
//    } error karna diatas sudah final (class manager)
}
class VicePresident(name: String) : Employee (name)
{
    override fun sayHello(name : String) {
        println("Hello $name, My name is Manager ${this.name}")
    }
}