package app

fun main() {
    val names: List<String> = listOf("Abdul", "Hafiz", "Ramadan")

    val anyNames = names.any { it.length > 5 }
    val noneNames = names.none { it.length > 5  }
    val allNames = names.all { it.length > 5 }

    println(anyNames)
    println(noneNames)
    println(allNames)

    val isAnyNames  = names.any()
    val isNoneNames = names.none()

    println(isAnyNames)
    println(isNoneNames)
}