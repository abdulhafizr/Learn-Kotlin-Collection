package app

fun main() {
    displayIterator(listOf("Abdul", "Hafiz", "Ramadan").iterator())
}

fun <T> displayIterator(iterator: Iterator<T>) {
    while (iterator.hasNext()) println(iterator.next())
}