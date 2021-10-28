val listAngka = mutableListOf (1,2,3,4,5,6)
val listKarakter = mutableListOf('a','b','c','d')
val listMix = listOf('a',"Kotlin", 3, true, "oke")

fun main (){
    listKarakter.add('k')//menambah nilai di belakang list
    listKarakter.add(1, 'z') // menambah item pada indeks ke-1
    listAngka[3] = 12 // mengubah nilai item pada indeks ke-3

    println(listMix)
    println(listKarakter)
    println(listAngka)
}