package app

fun main() {
    val set: Set<Int> = (1..20).toSet()

    println(set.first { it > 10 })
    println(set.last {it > 10})

    println(set.firstOrNull { it > 30 })
    println(set.lastOrNull { it > 30 })

    println(set.find { it > 30 })
    println(set.findLast { it > 30 })
}