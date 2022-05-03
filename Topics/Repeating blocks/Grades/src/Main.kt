const val TWO = 2
const val THREE = 3
const val FOUR = 4

fun main() {
    val n = readln().toInt()
    var a = 0
    var b = 0
    var c = 0
    var d = 0

    repeat(n) {
        val num = readln().toInt()
        if (num == TWO) {
            d++
        } else if (num == THREE) {
            c++
        } else if (num == FOUR) {
            b++
        } else a++
    }
    println("$d $c $b $a")
}