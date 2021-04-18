package app

fun main() {
    val students: List<List<String>> = listOf(
        listOf("Abdul", "Hafiz", "Ramadan"),
        listOf("Amanah", "Nur", "Az-zahra")
    )

    val listStudents: List<String> = students.flatten()
    println(listStudents)

    val studentWithData: List<Student> = listOf(
        Student("Abdul", listOf("Coding", "Gaming")),
        Student("Hafiz", listOf("Coding", "Gaming")),
        Student("Ramadan", listOf("Coding", "Gaming"))
    )

    val allStudentHobbies: List<String> = studentWithData.flatMap { it.hobbies }
}

data class Student(val name: String, val hobbies: List<String>)