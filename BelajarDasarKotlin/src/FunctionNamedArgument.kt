fun fullName(firsName :String,
             middleName:String,
             lastName:String,
             umur:Int) {
    println("Hello $firsName $middleName $lastName berumur $umur")
}

fun main() {
    fullName(firsName = "Lisvindanu",
        umur = 20,
        lastName = "Tampan",
        middleName = "Mantap")
    fullName("Lisvindanu", "Mantap", "Tampan", 20)
}