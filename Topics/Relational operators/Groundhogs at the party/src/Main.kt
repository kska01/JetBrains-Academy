const val TEN = 10
const val FIFTEEN = 15
const val TWENTY = 20
const val TWENTY_FIVE = 25

fun main() {
    val n = readln().toInt()
    val weekend = readln().toBoolean()
    println(n in TEN..TWENTY && !weekend || n in FIFTEEN..TWENTY_FIVE && weekend)
}