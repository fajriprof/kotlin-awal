import java.util.Scanner

fun main(){
    val input = Scanner(System.`in`)
    //input data
    println ("masukkan angka 1-7 = ")
    var x = input.nextInt()

    when (x) {
        1 -> print("Senin")
        2 -> print("Selasa")
        3 -> print("Rabu")
        4 -> print("Kamis")
        5 -> print("Jum'at")
        6 -> print("Sabtu")
        7 -> print("Minggu")
        else -> {
            print("nomer hari salah!")
        }
    }
}