package app

import data.Student

fun main() {
    val students: List<Student> = listOf(
        Student("Abdul Hafiz Ramadan", 20104069),
        Student("Amanah Nur Az-zahro", 20104070),
        Student("Muhammad Thoriq Al-burruj", 20104071),
        Student("Annisa Nur Baiti", 20104072)
    )

    println(students.sortedBy { it.name })
    println(students.sortedBy { it.nim })

    println(students.sortedByDescending { it.name })
    println(students.sortedByDescending { it.nim })

    println(students.sortedWith { student1, student2 ->
        student1.name.compareTo(student2.name)
    })
}