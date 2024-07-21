fun main() {
    fun hello(name : String, transformer: (String) -> String):String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val result = hello("Danu") {value : String -> value.toLowerCase()}
    println(result)
}