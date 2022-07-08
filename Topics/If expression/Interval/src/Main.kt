const val MIN = -14
const val TWELVE = 12
const val FIFTEEN = 15
const val SIXTEEN = 16
const val NINETEEN = 19

fun main() {
    val num = readln().toInt()
    println(
        if (num in MIN..TWELVE || num in FIFTEEN..SIXTEEN || num >= NINETEEN) {
            "True"
        } else {
            "False"
        }
    )
}