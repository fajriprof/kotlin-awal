fun main (){
    val setA = setOf(1, 2, 4, 2, 1, 5)
    val setB = setOf(1, 2, 4, 5)
    val setC = setOf(1, 5, 7)
    val union = setA.union(setC)
    val irisan = setA.intersect(setC)

    println(setA) //menanmpilkan data setOf
    println (7 in setA) //pengecekaan data
    println(union) //penggabungan setA dengan setB
    println(irisan) //irisan setA dengan setB
}