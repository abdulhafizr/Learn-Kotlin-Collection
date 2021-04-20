package app

fun main() {
    val list: List<Int> = listOf(4, 2, 3, 1, 4, 5, 6, 3, 3, 7, 3, 2, 7, 8, 9)

    val sortingAscending = list.sorted()
    val sortingDescending = list.sortedDescending()

    println(sortingAscending)
    println(sortingDescending)
}