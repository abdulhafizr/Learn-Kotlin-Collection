package app

fun main() {
    displayListIterator(listOf("Abdul", "Hafiz", "Ramadan").listIterator())

    displayEvenListIterator(listOf<Int>(1, 2, 3, 4, 5).listIterator())
}

fun <T> displayListIterator(listIterator: ListIterator<T>) {
    println("Next Print")
    while (listIterator.hasNext()) println(listIterator.next())

    println("Previous Print")
    while (listIterator.hasPrevious()) println(listIterator.previous())
}

fun displayEvenListIterator(listIterator: ListIterator<Int>) {
    while (listIterator.hasNext()) {
        if(listIterator.next() % 2 == 1) {
            println(listIterator.next())
        }
    }
}