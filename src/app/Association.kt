package app

fun main() {
    val association: List<String> = listOf("Abdul", "Hafiz", "Ramadan")

    val map1: Map<String, Int> = association.associate { it to it.length }
    val map2: Map<String, Int> = association.associateWith { it.length }
    val map3: Map<Int, String> = association.associateBy { it.length }

    println(map1)
    println(map2)
    println(map3)
}