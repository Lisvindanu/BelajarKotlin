package belajar.oop.kotlin.data

class Application(val name: String) {

    //inner singleton
//    object Utilities {
//        fun toUpper(name: String):String {
//            return name.toUpperCase()
//        }
//    }


    //*
    // Companion object adalah kemampuan membuat inner object di dalam class,
    // tanpa harus menggunakan nama object
    //Companion object secara otomatis akan
    // menggunakan nama Companion, atau bisa langsung diakses lewat nama class nya
    // *
    companion object  {
        fun toUpper(name: String):String {
            return name.toUpperCase()
        }
    }

}