package app

fun main() {
    val zipping: List<Pair<String, Any>> = listOf(
        "Nama" to "Abdul",
        "NIM" to 20104069,
        "Prodi" to "Software Engineering"
    )

    val unZipping: Pair<List<String>, List<Any>> = zipping.unzip()

    println(zipping)

    val (key, value) = unZipping
    println(key)
    println(value)
}