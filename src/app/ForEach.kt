package app

fun main() {
    val names = listOf("Abdul", "Hafiz", "Ramadan")

    for(name in names) {
        println("my name is $name")
    }

    names.forEach { println("my name is $it") }

    names.forEachIndexed {index, value ->
        println("$index : $value")
    }
}