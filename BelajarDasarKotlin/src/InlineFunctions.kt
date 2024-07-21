inline fun hello(firstName: ()-> String,
                 noinline lastName: () -> String
):String {
    return "Hello ${firstName()} ${lastName()}"
}

fun main() {
  for (i in 0..100) {
      println(hello({"Lisvin"}, {"Danu"}))
  }
}

/*/
/Menggunakan Higher-Order Function adalah salah satu fitur yang sangat berguna.
Namun penggunaan Higher-Order Function akan berdampak terhadap performa saat aplikasi berjalan, karena harus membuat object lambda berulang-ulang. Jika penggunaannya tidak terlalu banyak mungkin tidak akan terasa, tapi jika banyak sekali, maka akan terasa impact nya
Inline Functions adalah kemampuan di Kotlin yang mengubah Higher-Order Function menjadi Inline Function
Dimana dengan Inline Function, code di dalam Higher-Order Function akan di duplicate agar pada saat runtime, aplikasi tidak perlu membuat object lambda berulang-ulang

 */

/*/
/Saat menandai bahwa function adalah inline, maka secara otomatis semua parameter akan menjadi inline
Jika kita ingin memberi tahu bahwa jangan melakukan inline terhadap parameter, kita bisa menandai parameter tersebut dengan kata kunci noinline

 */
