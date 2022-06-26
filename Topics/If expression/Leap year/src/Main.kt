const val FOUR = 4
const val HUNDRED = 100
const val FOUR_HUNDRED = 400

fun main() {
    val year = readln().toInt()
    if (year % FOUR == 0 && year % HUNDRED != 0 || year % FOUR_HUNDRED == 0) {
        println("Leap")
    } else {
        println("Regular")
    }
}