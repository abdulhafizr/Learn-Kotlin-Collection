package app

fun main() {
    val list: List<String> = listOf("Abdul", "Hafiz", "Ramadan")

    println(list.size)
    println(list[0])
    println(list[1])
    println(list[2])
    println(list.lastIndex)

    val (firstName, middleName, lastName) = list
    println(firstName)
    println(middleName)
    println(lastName)
}