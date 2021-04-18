package app

fun main() {
    displayMutableIterator(mutableListOf("Abdul", "Hafiz", "Ramadan").iterator())
}

fun <T> displayMutableIterator(mutableIterator: MutableIterator<T>) {
    while (mutableIterator.hasNext()) println(mutableIterator.next())
}