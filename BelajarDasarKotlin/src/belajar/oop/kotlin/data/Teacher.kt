package belajar.oop.kotlin.data

open class Teacher(val name: String) {
    private fun teach() {
        println("Teach!")
    }

     open protected fun test() {
        println("test")
    }


}
class SuperTeacher(name: String) : Teacher(name) {
    override public fun test() {
        super.test()
    }
}