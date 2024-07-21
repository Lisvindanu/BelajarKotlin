fun hello(firstName: String, lastName: String = "", umur: Int? = null) {
    if (umur == null) {
        println("Hello $firstName $lastName")
    }
    println("Hello $firstName $lastName $umur")
}
fun main() {
    hello("Lisvin")
    hello("Lisvin", "Danu", 20)
}