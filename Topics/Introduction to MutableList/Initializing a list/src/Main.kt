const val LAST_INDEX = 99
const val TENTH = 9
const val SIZE = 100

fun main() {
    val numbers = MutableList(SIZE) { 0 }
    numbers[0] = 1
    numbers[TENTH] = TENTH + 1
    numbers[LAST_INDEX] = SIZE

    // do not touch the lines below 
    println(numbers.joinToString())
}