fun main (){

    val listAngka = listOf(1, 2, 3, 4, 5)
    val listChar = mutableListOf('a', 'b', 'c')
    val listMix = listOf('a', "Kotlin", 3, true, "Ayo")

    listChar.add('d') // menambah nilai 'd' diakhir list
    listChar.add(1, 'f') // menambah item pada indeks ke-1
    listChar.removeAt(1)// menghapus item
    listChar[2] = 'k' // mengganti isi item


    println (listAngka[4])
    println (listChar)
    println (listChar[1])
    print (listMix[3])

}