const val TEN = 10
const val HUNDRED = 100

fun main() {
    val num = readln().toInt()
    println("${num / HUNDRED + num / TEN % TEN + num % TEN}")
}