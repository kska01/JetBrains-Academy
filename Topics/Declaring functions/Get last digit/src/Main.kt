import kotlin.math.abs

const val TEN = 10

fun getLastDigit(a: Int) = abs(a % TEN)

/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}