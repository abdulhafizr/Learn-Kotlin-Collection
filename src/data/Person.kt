package data

data class Person(val name: String) {
    override fun equals(other: Any?): Boolean = when(other) {
        is Person -> this.name == other.name
        else -> false
    }

    override fun hashCode(): Int = this.name.hashCode()
}
