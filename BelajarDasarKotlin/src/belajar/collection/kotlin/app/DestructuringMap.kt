package belajar.collection.kotlin.app

fun main() {
    val map = mapOf("a" to "Danu",
        "b" to "Lisvin",
        "c" to "Lisvindanu",)

//    for(entry in map){
//        println("${entry.component1()} : ${entry.component2()}")
//    }

for ((k,v) in map) {
    println("$k = $v")
}

    map.forEach {entry -> println("${entry.component1()} : ${entry.component2()}") }
    map.forEach {(key,value) -> println("$key -> $value")}
}
