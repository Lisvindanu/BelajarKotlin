package belajar.oop.kotlin.data

open class Shape {
    //properties juga harus dibikin open agar bisa di overrid
    open val corner: Int = -1
    open fun printName() {
        println("This is Shape")
    }
}

class Rectangle : Triangle() {
    override val corner: Int = 4
    val parentCornet : Int = super.corner
    override fun printName() {
        println("This is Triangle")
        super.printName()
    }
}

open class Triangle : Shape() {
    override val corner: Int = 5
}