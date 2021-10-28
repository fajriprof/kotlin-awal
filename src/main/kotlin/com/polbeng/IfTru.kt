import java.util.Scanner

fun main (){
    val input = Scanner(System.`in`)
    //input data
    print ("masukkan nominal belanja ")
    val totalBelanja = input.nextInt()

    if (totalBelanja > 2000000) {
        print("Anda memperoleh Case dan Anti Gores")
    }
    else {
        print("Anda memperoleh pulsa 20K")
    }

}