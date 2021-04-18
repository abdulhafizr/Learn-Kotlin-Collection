package app

fun main() {
    val pair1: Pair<String, String> = Pair("Abdul", "Hafiz")
    println(pair1.first)
    println(pair1.second)

    val pair2: Pair<String, String> = "Abdul" to "Hafiz"
    println(pair2.first)
    println(pair2.second)

}