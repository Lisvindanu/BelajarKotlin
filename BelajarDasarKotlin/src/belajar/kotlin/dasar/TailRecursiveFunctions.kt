package belajar.kotlin.dasar

fun main() {
    tailrec fun display(value: Int) {
        println("Recursive $value")
        if (value > 0) {
            display(value - 1)
        }
    }

    tailrec fun factorialRecursive(value: Int, total: Int = 1): Int {
    return when (value) {
        1 -> total
        else ->factorialRecursive(value - 1, total * value)
    }
}
    println(factorialRecursive(10))
}

//factorialTail(5, 1)
//factorialTail(4, 5)
//factorialTail(3, 20)
//factorialTail(2, 60)
//factorialTail(1, 120)
//120