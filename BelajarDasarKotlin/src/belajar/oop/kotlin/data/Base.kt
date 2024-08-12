package belajar.oop.kotlin.data

interface Base {
    fun sayHello(name:String)
    fun sayGoodBye(name:String)
}

class MyBase : Base {
    override fun sayHello(name: String) {
        println("Hello $name")
    }

    override fun sayGoodBye(name: String) {
        println("Goodbye $name")
    }
}

class MyBaseDelegate(val base : Base ) : Base {
    override fun sayHello(name: String) {
        base.sayHello(name)
    }

    override fun sayGoodBye(name: String) {
        base.sayGoodBye(name)
    }
}

class Delegate(val base: Base): Base by base
class Delegate1(val base: Base): Base by base {
    override fun sayGoodBye(name: String) {
        println("Bye $name")
    }
}

/**
 * Salah satu design pattern lain yang populer adalah Delegation
 * Delegation sederhananya adalah meneruskan properties atau function ke object yang lain
 * Kotlin mendukung delegation tanpa harus membuat kode secara manual
 *
 *
 *
 * Dalam delegation, properties dan function secara otomatis akan didelegasikan ke object yang dipilih
 * Namun kita tetap bisa meng-override properties dan function jika kita mau
 *
 * */