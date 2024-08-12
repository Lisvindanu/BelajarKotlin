package belajar.oop.kotlin.data

class Student(var name:String = "", var nameOpposite : String = "") {

    fun sayHello(name:String) {
        println("Hello $name, Selamat Sore")
    }

    fun sayHello(nameParam: String, nameOppositeParam: String ) {
        println("Halo $nameParam, ini adalah function overloading yang diajarkan oleh $nameOppositeParam")
    }

    fun lari() {
        println("Dia ($name) berlari, membuatku ($nameOpposite) terkejut")
    }

    fun umur(age: Int) : Int {
        println("umur saya adalah $age")
        return age
    }
}