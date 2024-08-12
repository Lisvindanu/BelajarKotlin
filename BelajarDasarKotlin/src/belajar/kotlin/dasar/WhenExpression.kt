package belajar.kotlin.dasar

fun main() {
    val gradeUjian = 'B'
    when(gradeUjian) {
        'A' -> {
            println("amazing")
        }
        'B' -> {
            println("Good")
        }
        'C' -> {
            println("Not bad")
        }
        'D' -> {
            println("Bad")
        }
        else -> {
            println("Coba Lagi")
        }

    }

    when(gradeUjian) {
//   if(gradeUjian == "A" || gradeUjian == "B" || gradeUjian == "C")
        'A', 'B', 'C' -> {
            println("Selamat Anda Lulus")
        }
        else -> println("Coba Lagi Tahun Depan")
    }

    val finalExam = "D"
    val passValues: Array<String> = arrayOf("A", "B", "C")
    when(finalExam) {
        in passValues -> println("Pass")
        !in passValues -> println("try again next year! 🙏🏻🙏🏻🙏🏻")
    }

    val name = "Lisvindanu"
    when (name) {
        is String -> println("Ini adalah String")
        !is String -> println("Ini bukan String")
    }

    val ujianMu = 8
    when {
        ujianMu >= 80 -> println("Kamu lulus")
        ujianMu < 60 -> println("Cupu")
        else -> println("galulus")
    }
}