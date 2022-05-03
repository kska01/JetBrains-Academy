const val FOUR = 4

fun main() {
    val n = readln().toInt()
    var max = 0

    repeat(n) {
        val number = readln().toInt()
        if (number % FOUR == 0 && number > max) {
            max = number
        }
    }

    println(max)
}