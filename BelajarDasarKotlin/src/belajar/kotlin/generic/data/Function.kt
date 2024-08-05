package belajar.kotlin.generic.data

class Function(val name:String) {

    fun<T> sayHello(param: T) {
        println("Hallo $param, my name is $name")
    }


}
