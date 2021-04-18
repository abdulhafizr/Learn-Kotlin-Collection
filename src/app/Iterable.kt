package app

fun main() {
    displayIterable(listOf("Abdul", "Hafiz", "Ramadan"))
    displayIterable(setOf("Abdul", "Hafiz", "Ramadan", "Hafiz"))
}

fun <T> displayIterable(iterator: Iterable<T>) {
    val iterators = iterator.iterator()
    while (iterators.hasNext()) println(iterators.next())
}