//Higher-Order Function adalah function yang menggunakan function sebagai parameter atau mengembalikan function
//Penggunaan Higher-Order Function kadang berguna ketika kita ingin membuat function yang general dan ingin mendapatkan
// input yang flexible beruba lambda, yang bisa dideklarasikan oleh si user ketika memanggil function tersebut

fun main() {

    fun hello(name: String, transformer: (String) -> String) : String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }
    val lambdaUpper = {value : String -> value.toUpperCase()}
    println(hello("Lisvin", lambdaUpper))

    println(hello("DANU", {value: String -> value.toLowerCase()}))

    val result1 = hello("DANU", {value: String -> value.toLowerCase()})
    println(result1)

    val result = hello("Danu") {value : String -> value.toLowerCase()}
    println(result)

}