const val THREE = 3

fun main() {
    val numberString = readln()
    var sum1 = 0
    var sum2 = 0

    for ((index, character) in numberString.withIndex()) {
        if (index < THREE) {
            sum1 += character.toString().toInt()
        } else {
            sum2 += character.toString().toInt()
        }
    }

    println(if (sum1 == sum2) "Lucky" else "Regular")
}