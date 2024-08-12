package belajar.oop.kotlin.data

class Mahasiswa(val name:String, val age:Int) {

}
fun Mahasiswa?.sayHello(name: String) {
    if(this != null) {
        println("Hello $name, my name is ${this.name} and my age is ${this.age}")
    }

}

val Mahasiswa.upperName : String
    get() = this.name.toUpperCase()