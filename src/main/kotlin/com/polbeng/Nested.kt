import java.util.*

fun main(args: Array<String>){
    val input = Scanner(System.`in`)
    //input data
    println ("Apakah anda member? Yes/No = ")
    var isMember = input.nextLine()

    println ("Masukkan Password = ")
    var password = input.nextLine()

    if (isMember == "Yes"){
        if(password == "petanikode"){
            println("Selamat datang")
        } else {
            println("Password salah!")
        }
    } else {
        println("Silahkan daftar telebih dahulu")
    }
}