package belajar.oop.kotlin.data

class Note(title: String) {
    var title: String = title
//        get() = field
get() {
    println("Call getter function")
    return field
}
        set(value) {
            println("Call setter function")
            if (value.isNotBlank()) {
                field = value
            }else {
                println("Invalid blank title")
            }
        }
}

class BigNote (val title: String) {
    val bigTitle: String
        get() = title.toUpperCase()

}