
//tidak bisa memanggil contohHelloWorld karna hanya ada didalam scope main
//fun satu() {
//    error
//    contohHelloWorld()
//}
//
//fun dua(){
//    contohHelloWorld()
//}

fun main() {
    fun contohHelloWorld() {
        println("hello world")
    }
    contohHelloWorld()
}