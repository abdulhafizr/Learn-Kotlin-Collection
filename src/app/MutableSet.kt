package app

import data.Person

fun main() {
    val mutableSet = mutableSetOf<Person>()

    mutableSet.add(Person("Abdul"))
    mutableSet.add(Person("Hafiz"))
    mutableSet.add(Person("Hafiz"))
    mutableSet.add(Person("Ramadan"))

    println(mutableSet.size)
    println(mutableSet.contains(Person("Abdul")))
    mutableSet.forEach { println(it.name) }
}