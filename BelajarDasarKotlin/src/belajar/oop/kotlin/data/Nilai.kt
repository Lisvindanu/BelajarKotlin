package belajar.oop.kotlin.data

class Nilai (nilaiA : Int, nilaiB : Int, nilaiC : Int){

    var nilaiA: Int = nilaiA
    var nilaiB: Int = nilaiB
    var nilaiC: Int = nilaiC
    constructor(nilaiA: Int, nilaiB: Int) : this(nilaiA, nilaiB, 0 ) {

        }
    fun Tambah(nilaiA: Int, nilaiB: Int) : Int {
        return nilaiA + nilaiB
    } fun Kali(nilaiA: Int, nilaiB: Int) : Int {
        return nilaiA * nilaiB
    } fun Kurang(nilaiA: Int, nilaiB: Int) : Int {
        return nilaiA - nilaiB
    } fun Bagi(nilaiA: Int, nilaiB: Int) : Int {

        val hasilBagi =   nilaiA / nilaiB
        println("Hasil pembagian nilai $nilaiA / $nilaiB adalah $hasilBagi")
        return hasilBagi
    }fun sisaBagi(nilaiA: Int, nilaiB: Int) : Int {

        val hasilMod = nilaiA % nilaiB
        println("Hasil pembagian nilai $nilaiA / $nilaiB adalah $hasilMod")
        return hasilMod
    }
}