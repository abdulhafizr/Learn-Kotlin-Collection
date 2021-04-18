package app

fun main() {
    val key: List<String> = listOf("Name", "nim", "Prodi")
    val value: List<Any>  = listOf("Abdul Hafiz Ramadan", 20104069, "Software Engineering")

    val mahasiswa1: List<Pair<String, Any>> = key.zip(value)
    val mahasiswa2: List<String> = key.zip(value) {value1, value2 -> "$value1 : $value2"}

    println(mahasiswa1)
    println(mahasiswa2)

}