package belajar.collection.kotlin.app

/*Flattening adalah operasi transformasi
untuk menjadikan nested collection menjadi flat
 Flattering Operation
Keterangan
flatten
Mengubah nested collection menjadi flat collection
flatMap((T) -> Iterable<R>)
Mengubah collection T menjadi flat collection R

 */
class Member(val name: String, val hobies: List<String>)

fun main() {
    val list1: List<List<String>> = listOf(
        listOf("Lisvin", "Danu", "Lisvindanu"),
        listOf("Lisvin", "Danu", "Lisvindanu"),
        listOf("Lisvin", "Danu", "Lisvindanu"),
        listOf("Lisvin", "Danu", "Lisvindanu")
    )

    val listString: List<String> = list1.flatten()
    println(listString)

    val members: List<Member> = listOf(
        Member("Danu", listOf("Gaming", "Coding")),
        Member("Lisvin", listOf("Ngamuk", "Ngopi"))
    )
//    val hobies = members.map {it.hobies} .flatten()
   val hobies: List<String> = members.flatMap {it.hobies}
   print(hobies)
}