const val NUMBER_OF_CLASSROOM = 3

fun main() {
    var result = 0

    repeat(NUMBER_OF_CLASSROOM) {
        result += numberOfDesk(readln().toInt())
    }
    println(result)
}

fun numberOfDesk(n: Int) = if (n % 2 == 0) n / 2 else n / 2 + 1