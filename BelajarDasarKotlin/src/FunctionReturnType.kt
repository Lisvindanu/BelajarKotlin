fun sum(a: Int, b:Int): Int {
    val total = a+b
    return total
}

fun bagi(a: Int, b: Int): Int {
    if(b==0) {
        return 0
    }else {
    val result = a/b
    return result
    }
}

fun main() {
    println(sum(10, 10))
    val result = sum(200, 200)
    println(result)

    val result2 = sum(5, 9)
    println(result2)

    println(bagi(100, 10))
    println(bagi(100, 0))
}