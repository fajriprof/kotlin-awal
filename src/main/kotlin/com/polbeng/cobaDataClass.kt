data class CobaDataUser(val nama : String, val umur : Int)

fun main(){

    val dataUser0 = CobaDataUser("Fajri", 33)
    val dataUser1 = CobaDataUser("Fajri", 33)
    val dataUser2 = CobaDataUser("Fajru", 33)
//    println(user)
//    println(dataUser0)

    println(dataUser0.equals(dataUser1))
    print(dataUser0.equals(dataUser2))

}