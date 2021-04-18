package app

fun main() {
    val names: List<String> = listOf("Abdul", "Hafiz", "Ramadan", "Amanah", "Nur", "Az-zahra")

    val (namesGreaterThan5, namesSmallThan5) = names.partition { it.length > 5 }

    println("Names greater than 5 : $namesGreaterThan5")
    println("Names small than 5 : $namesSmallThan5")
}