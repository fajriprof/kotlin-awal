val setA = setOf(1, 2, 4, 2, 1, 5)
val setB = setOf(1, 2, 4, 5)
val setC = setOf(1, 5, 7)
//union setA n setC [1 2 4 2 1 5 1 5 7]
fun main () {
    val union = setA.union(setC)
    val irisan = setA.intersect(setC)

    println(setA)
    println (5 in setA)
    println (3 in setA)
    println (union)
    println(irisan)
}