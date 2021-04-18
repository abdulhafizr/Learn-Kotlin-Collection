package app

import java.lang.StringBuilder

fun main() {
    val names: List<String> = listOf("Abdul", "Hafiz", "Ramadan")

    val string1: String = names.joinToString(separator = " ")
    val string2: String = names.joinToString(separator = " ") {it.toUpperCase()}

    println(string1)
    println(string2)

    val builder: StringBuilder = StringBuilder()

    names.joinTo(buffer = builder, separator = " ", postfix = " | ") {it.toLowerCase()}
    names.joinTo(buffer = builder, separator = " ", postfix = " | ")
    names.joinTo(buffer = builder, separator = " ") {it.toUpperCase()}

    println(builder)
}