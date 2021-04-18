package app

fun main() {
    val list: List<String> = listOf("a", "b", "a", "c", "d", "b", "a")

    val groupByMapElement: Map<String, List<String>> = list.groupBy { it }
    val groupByMapLength: Map<Int, List<String>> = list.groupBy { it.length }

    println(groupByMapElement)
    println(groupByMapLength)


    val groupingElement: Grouping<String, String> = list.groupingBy { it }

    println(groupingElement)
}