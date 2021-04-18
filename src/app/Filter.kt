package app

fun main() {
    val names: List<String> = listOf("Abdul", "Hafiz", "Ramadan", "Amanah", "Nur", "Az-zahra")

    val namesGreaterThan5: List<String> = names.filter { it.length > 5 }
    val namesSmallThan5: List<String> = names.filterNot { it.length > 5 }

    println("Names greater than 5 : $namesGreaterThan5")
    println("Names small than 5 : $namesSmallThan5")


    val listAnyCanNull: List<Any?> = listOf("Abdul", 18, null, "Zahra", 18, null)

    val listString: List<String> = listAnyCanNull.filterIsInstance<String>()
    val listInt: List<Int> = listAnyCanNull.filterIsInstance<Int>()
    val listNotNull: List<Any> = listAnyCanNull.filterNotNull()

    println("List of String : $listString")
    println("List of Int : $listInt")
    println("List of not null : $listNotNull")

}