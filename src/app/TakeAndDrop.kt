package app

fun main() {
    val chars: List<Char> = ('a'..'z').toList()

    println(chars.take(3))
    println(chars.takeLast(3))
    println(chars.takeWhile { it < 'r' })
    println(chars.takeLastWhile { it > 'r' })

    println(chars.drop(3))
    println(chars.dropLast(3))
    println(chars.dropWhile { it < 'r' })
    println(chars.dropLastWhile { it > 'r' })
}