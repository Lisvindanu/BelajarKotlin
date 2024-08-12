package belajar.oop.kotlin.data

enum class Gender(val description: String) {
    MALE("Male"),
    FEMALE("Female");

    fun showDescrioption() {
        println(description)
    }
}