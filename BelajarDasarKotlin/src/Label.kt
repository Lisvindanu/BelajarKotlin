fun labelBreak() {
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            if (i > 5) {
                break@loopI
            }
            println("$i x $j = ${i * j}")
        }
    }
}

fun labelContinoue() {
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            if (j == 5) {
                continue@loopI
            }
            println("$i x $j = ${i * j}")
        }
    }
}
fun main() {
    fun test(name:String, operation:(String) -> Unit): Unit = operation(name)
    test("") {
        if(it == "") {
            return@test
        }else {
            println("Lisvindanu")
        }
    }
}