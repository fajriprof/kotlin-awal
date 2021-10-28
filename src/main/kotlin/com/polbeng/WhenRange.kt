import java.util.Scanner

fun main(args: Array<String>){
    val input = Scanner(System.`in`)
    //input data
    println ("masukkan angka 10-100 = ")
    var nilai = input.nextInt()
    var grade: String = ""

    when (nilai) {
        in 85..100 -> grade = "A"
        in 75..84 -> grade = "B+"
        in 65..74 -> grade = "B"
        in 55..64 -> grade = "C"
        in 45..54 -> grade = "D"
        else -> grade = "F"
    }

    println("Selamat anda mendapatkan nilai: $grade")
}