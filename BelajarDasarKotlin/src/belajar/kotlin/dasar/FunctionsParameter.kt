package belajar.kotlin.dasar

fun sayHello(firstName : String, lastName: String?, umur:Int) {
   if (lastName == null) {
       println("Hello $firstName $umur")
   }else {
       println("Hello $firstName $lastName $umur")
   }
}

fun main() {
    sayHello("Lisvin", "Danu", 20)
    sayHello("Firda", null, 18)

}