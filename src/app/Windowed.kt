package app

fun main() {
    val list: List<Int> = (1..5).toList()

    println(list.windowed(3, 1, false)) // [[1, 2, 3], [2, 3, 4], [3, 4, 5]]
    println(list.windowed(3, 1, false) {it.size}) // [3, 3, 3]
    println(list.windowed(3, 1, true)) // [[1, 2, 4], [2, 3, 4], [3, 4, 5], [4, 5], [5]]
    println(list.windowed(3, 1, true) {it.size}) // [3, 3, 3, 2, 1]

    println(list.windowed(3, 3, false)) // [[1, 2, 3]]
}