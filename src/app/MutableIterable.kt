package app

fun main() {
    displayMutableIterable(mutableListOf("Abdul", "Hafiz", "Ramadan"))
}

fun <T> displayMutableIterable(iterable: MutableIterable<T>) {
    val iterators = iterable.iterator()
    iterators.remove()
    while (iterators.hasNext()) {
        println(iterators.next())
    }
}