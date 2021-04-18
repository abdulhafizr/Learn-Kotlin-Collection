package app

fun main() {
    val names: List<String> = listOf("Abdul", "Hafiz", "Ramadan")

    val list1: List<String> = names + "Amanah"
    val list2: List<String> = names + listOf("Amanah", "Nur", "Az-zahra")

    println(list1)
    println(list2)

    val list3: List<String> = names - "Ramadan"
    val list4: List<String> = names - listOf("Ramadan", "Hafiz")

    println(list3)
    println(list4)


    val mahasiswa: Map<String, Any> = mapOf(
        "Name" to "Abdul Hafiz Ramadan",
        "NIM"  to 20104069
    )

    val map1: Map<String, Any> = mahasiswa + ("Prodi" to "Software Engineering")
    val map2: Map<String, Any> = mahasiswa - "NIM"

    println(map1)
    println(map2)

}