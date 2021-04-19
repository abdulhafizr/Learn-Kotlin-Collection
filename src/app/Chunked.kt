package app

fun main() {
    val list: List<Int> = (1..100).toList()

    val list1: List<List<Int>> = list.chunked(10)
    println(list1)

    val list2: List<Int> = (list.chunked(10) { it.sum() })
    println(list2)
}