package belajar.oop.kotlin.app

import belajar.oop.kotlin.data.User

fun main() {
    val user = User("Danu", "rahasia")
    print(user)

}

/**
 * toString() adalah function yang digunakan untuk memberitahu representasi String dari object
 * Saat kita melakukan println object, sebenarnya function toString() akan dipanggil
 * Standarnya, function toString() akan mengembalikan referensi kode unik dari object
 * Kita bisa meng-override function toString() jika ingin mengubah representasi dari String pada object kita
 *
 */