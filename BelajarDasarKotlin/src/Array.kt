fun main() {
    val member: Array<String> = arrayOf("Danu", "Lisvin", "Lisvindanu")
    println(member[0])
    member.set(1, "Ganteng")
    println(member[1])
    member[2]="HAHAHAHAH"
    print(member.get(2))
    println(member.size)
    val nilai: Array<Int> = arrayOf(11,22,33)
    println(nilai[0])
    println(nilai[1])
    println(nilai[2])

    val names: Array<String?> = arrayOfNulls(5)
    names.set(0,"Nama Saya Danu")
    println(names[0])
}