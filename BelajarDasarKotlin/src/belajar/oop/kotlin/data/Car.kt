package belajar.oop.kotlin.data

class Car(//constructor primary
 paramBrand: String, paramName: String, paramYear: Int ) {


    // scope to make a func should use init in prinmary constructor
    init {
        println("Car $paramBrand dibuat pada tahun $paramYear")
    }
    //second constructor
    constructor(paramBrand: String, paramName: String) : this(paramBrand, paramName, 2020) {
        println("Secondary Constructor 1")
    }

    constructor(paramBrand: String) : this(paramBrand, " ") {
        println("Secondary Constructor 2")
    }
    var brand: String = paramBrand
    var name: String = paramName
    var year: Int = paramYear
}