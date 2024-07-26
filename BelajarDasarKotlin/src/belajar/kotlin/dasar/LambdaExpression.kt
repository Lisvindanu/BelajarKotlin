package belajar.kotlin.dasar

fun main() {
    val contohLambda: (String, String) -> String = { firstName: String, lastName:String ->
        val result = "$firstName $lastName"
        result
    }
    val result = contohLambda("Lisvin", "Danu")
    println(result)

    val sayHello: (String) -> String = {
        "Hello $it"
    }
    val result2 = sayHello("Lisvin")
    println(result2)
}