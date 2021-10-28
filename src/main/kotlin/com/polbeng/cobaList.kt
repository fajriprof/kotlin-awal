data class User (val name: String)

fun main (){
    val cobaList = mutableListOf(1,2, true, "kotlin", 5, User("fajri"))

    println(cobaList[3])
    cobaList.add('d') // menambah item di akhir list
    cobaList.add(1, "love") // menambah item pada indeks ke-1
    cobaList[4] = false // mengubah nilai item pada indeks ke-3
    cobaList.removeAt(1) // menghapus item User() berdasarkan index atau posisi nilai di dalam Array


    println(cobaList.toString())
}