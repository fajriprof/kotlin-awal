data class iniUser(val name : String, val age : Int){
    fun intro (){
        println ("My name is $name, i am is $age years old")
    }
}


fun main (){
    val dataUser = iniUser("nrohmen", 17)
    val dataUser4= dataUser.copy()
    val dataUser5= dataUser.copy(name="Aji")

    dataUser.intro()
    println(dataUser)
    println(dataUser4)
    println(dataUser5)


}