package belajar.oop.kotlin.app.TestInheritance

class Jutsu(jutsu: String, chakra: String, user: String) : Ninja(chakra, user)  {
    private val jutsu:String = jutsu
    fun Jutsu() : String {
        return jutsu
    }

    fun printDetails() {
        println("Jutsu $jutsu yang chakra bertipe elememen $chakra digunakan oleh $user")
    }
}

