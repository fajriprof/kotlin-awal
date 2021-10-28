val angkalist = listOf(1,2,3,4,5,6,7,8,9,10)
val huruflist = listOf('p','o','l','i','t','e','k','n','i','k')

fun main () {
    println (angkalist.filter { it % 2 == 0 }) // filter data
    println (angkalist.filterNot { it % 2 == 0 }) // filter data
    println (angkalist.map { it * 5 }) // mengalikan data
    println (angkalist.count()) //hitung jumlah data
    println (angkalist.sum()) //total nilai data
    println(huruflist.sortedDescending())
    println(huruflist.sorted())

    // latihan 1-3
    // List Of
    // Set of
    // Map Of
    // Collection Data

}