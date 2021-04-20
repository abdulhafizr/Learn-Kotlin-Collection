package app

fun main() {
    val set: Set<Int> = (1..10).toSet()

    println(set.first())
    println(set.last())

    println(set.elementAt(0))
//    println(set.elementAt(10)) // ERROR
    println(set.elementAtOrNull(10)) // NULL
    println(set.elementAtOrElse(10) {0}) // 0
}