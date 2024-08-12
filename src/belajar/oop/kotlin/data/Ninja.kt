package belajar.oop.kotlin.data

class Ninja(var nameParam: String = "", var nameVillages: String = "") {
    fun sayHello(nameParam: String, nameVillages: String) {
        println("Hallo $nameParam, aku berasal dari ${this.nameVillages}")
    } fun sayHello2(nameParam: String, nameVillages: String) {
        println("Hallo ${this.nameParam}, aku berasal dari $nameVillages")
    }
}
