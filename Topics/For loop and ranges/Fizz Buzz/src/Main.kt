const val THREE = 3
const val FIVE = 5

fun main() {
    val range = readln().toInt()..readln().toInt()
    for (v in range) {
        println(
            if (v % THREE == 0 && v % FIVE == 0) {
                "FizzBuzz"
            } else if (v % THREE == 0) {
                "Fizz"
            } else if (v % FIVE == 0) {
                "Buzz"
            } else {
                "$v"
            }
        )
    }
}