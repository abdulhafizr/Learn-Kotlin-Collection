package app

fun main() {
    val list: List<Int> = (1..10).toList()

    println(list.contains(5))
    println(list.containsAll(listOf(1, 2, 3)))
    println(list.containsAll(listOf(1, 2, 11)))
    println(list.isEmpty())
    println(list.isNotEmpty())
}