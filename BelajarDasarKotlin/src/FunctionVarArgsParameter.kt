fun hitungTotal(name:String, vararg  values: Int): Int {
    var total = 0

    for (value in values) {
        total += value
    }
    println("total untuk $name adalah $total")
    return total;
}

fun main() {
    //val values = arrayOf(10,10,10)
    val result = hitungTotal("Danu",10,10,10,10,10)
    println("Hasil perhitungan adalah $result")
}