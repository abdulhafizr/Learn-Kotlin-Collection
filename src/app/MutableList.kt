package app

fun main() {
    val mutableList = mutableListOf<String>()

    mutableList.add("Abdul")
    mutableList.add("Hafiz")
    mutableList.add(2, "Ramadan")

    mutableList.removeAt(0)
    mutableList.remove("Hafiz")

    println(mutableList.toList())
}