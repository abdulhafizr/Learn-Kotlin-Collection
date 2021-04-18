package app

import data.Person

fun main() {
    val set: Set<Person> = setOf(
        Person("Abdul"), Person("Hafiz"), Person("Ramadan"), Person("Hafiz")
    )

    println(set.size)
    println(set.contains(Person("Abdul")))
    set.forEach { println(it.name) }
}