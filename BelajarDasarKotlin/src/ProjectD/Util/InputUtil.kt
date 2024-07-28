package ProjectD.Util

import java.util.Scanner

class InputUtil {
    private val input = Scanner(System.`in`)

    fun inputString(info: String):String {
        println("$info : ")
        return input.nextLine()
    }    fun inputInt(info: String):Int {
        println("$info : ")
        return input.nextInt()
    }
}