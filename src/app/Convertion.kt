package app

fun main() {
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val range = 1..10

    val arrayToList = array.toList()
    val arrayToMutableList = array.toList()
    val arrayToSet  = array.toSet()
    val arrayToMutableSet  = array.toSet()

    val rangeToList = range.toList()
    val rangeToMutableList = range.toMutableList()
    val rangeToSet  = range.toSet()
    val rangeToMutableSet  = range.toMutableSet()
}