package belajar.oop.kotlin.annotations
/*
*
@Target
Memberitahu annotation bisa digunakan di mana? Class, function, properties, dan lain-lain
@Retention
Memberitahu annotation apakah disimpan di hasil kompilasi, dan apakah bisa dibaca oleh reflection?
@Repeatable
Memberitahu annotation apakah bisa digunakan lebih dari sekali di target yang sama?
@MustBeDocumented
Memberitahu annotation apakah perlu didokumentasikan di public API
*/

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented

annotation class Fancy(val author: String) {
}
