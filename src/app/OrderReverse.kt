package app

fun main() {
    val name: MutableList<String> = mutableListOf("Abdul", "Hafiz", "Ramadan")

    val nameReversed: List<String> = name.reversed()
    val nameAsReversed: MutableList<String> = name.asReversed()

    println("Name reversed : $nameReversed")
    println("Name reversed : $nameAsReversed")

    name.add("Amanah")

    println("Name reversed : $nameReversed")
    println("Name reversed : $nameAsReversed")
}