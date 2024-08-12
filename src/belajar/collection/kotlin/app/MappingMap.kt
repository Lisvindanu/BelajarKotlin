package belajar.collection.kotlin.app

fun main() {
    val map : Map<Int, String> = mapOf(
        1 to "Lisvin",
        2 to "Danu",
        3 to "Gans"
    )

    val mapKeys = map.mapKeys { it.key * 10}
    println(mapKeys)

    val mapValues = map.mapValues { it.value.toUpperCase() }
    println(mapValues)
}