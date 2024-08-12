package belajar.kotlin.dasar

fun recursifFactorial(Angka : Int) : Int {
    if(Angka == 1) {
        return 1
    }
    return Angka * recursifFactorial(Angka - 1)
}

fun main() {
    println(recursifFactorial(5))
}