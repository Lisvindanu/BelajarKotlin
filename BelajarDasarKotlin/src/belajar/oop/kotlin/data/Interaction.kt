package belajar.oop.kotlin.data

interface Interaction {
    val name:String
    fun sayHello(name: String) {
//        println("Hello $name, my name is ${this.name}") concrete function juga bisa
    }
}

interface Lari : Interaction
//inheritance antar interface
{
    fun lari() {
        println("Lari")
    }
}

open class bisaExtendClassLain() {
   open  var umur: Int? = null
//    fun cekUmur(umur: Int) {
//        if (umur >= 20) {
//            println("legal")
//        } else {
//            println("Belum legal lu")
//        }
//    }
   fun cekUmur(umur: Int) {
       when {
           umur >= 20 -> println("Anjay legal")
           else -> println("jir bocah")
       }
   }
}

interface MoveA {
    fun move() = println("move A")
}interface MoveB {
    fun move() = println("move B")
}
open class hanyaBisaSatu
class Human(override val name: String, override var umur: Int?):bisaExtendClassLain(),   Lari, Go, MoveA, MoveB {
    override fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name}")
    }

    override fun move() {
        super<MoveA>.move()
        super<MoveB>.move()
        println("Move Human")
    }
}