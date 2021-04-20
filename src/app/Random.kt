package app

fun main() {
    val list: List<Int> = (1..10).toList()

    println(list.random())
    println(list.random())

    println((1..10).random())
    println((1..10).random())
}