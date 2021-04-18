package app

fun main() {
    val list: List<Int> = (1..100).toList()

    val list1: List<Int> = list.slice(0..50)
    val list2: List<Int> = list.slice(list.indices step 2)

    println(list1)
    println(list2)
}