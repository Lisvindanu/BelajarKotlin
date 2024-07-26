package belajar.kotlin.dasar

fun main() {
    fun hello(name: String, transformer: (String) -> String) : String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

 val upper = fun(value:String):String {
     if (value == "") {
         return "UPS"
     } else {
         return value.toUpperCase()
     }
 }

    println(hello("Lisvin", upper))
    println(hello("", upper))
    println(hello("LISVINDANU", fun(value:String):String {
        return value.toLowerCase()
    }))

}