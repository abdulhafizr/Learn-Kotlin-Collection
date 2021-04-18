package app

fun main() {
    val names = listOf("Abdul", "Hafiz", "Ramadan")
    val upperNames = names.map { it.toUpperCase() }
    val lowerNames = names.map { it.toLowerCase() }

    val numbers = (1..10).toList()
    val doubleNumbers = numbers.map { it * 2 }
    val numbersXIndex = numbers.mapIndexed { index, number -> index * number }
    val evenNumbers = numbers.mapNotNull { if (it % 2 == 0) it else null }

}