package belajar.oop.kotlin.data

class User(// properties Constructor
            var usernameParam : String = "",
            var passwordParam : String) {
    override fun toString(): String {
        return "user with username = $usernameParam"
    }
}