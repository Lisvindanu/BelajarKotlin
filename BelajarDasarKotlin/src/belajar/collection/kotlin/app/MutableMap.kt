package belajar.collection.kotlin.app

fun main() {
    val mutableMap: MutableMap<String, String> = mutableMapOf()
    mutableMap.put("a","Danu")
    mutableMap["Vin"] = "rajaIblis"

//    println("Data" + mutableMap.get("a"))
//    println(mutableMap.get("Vin"))
//    println(mutableMap.getOrDefault("d", "tidak ada"))
//    println(mutableMap.get("d"))

    mutableMap.remove("a")
    for ((key,value) in mutableMap) {
        println("$key to $value")
    }
}