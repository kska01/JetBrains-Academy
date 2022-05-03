import kotlin.math.abs

fun main() {
    val (x, y) = readln().split(' ').map { it.toInt() }
    val (a, b) = readln().split(' ').map { it.toInt() }

    if (abs(x - a) == 1) {
        if (abs(y - b) == 2) println("YES") else println("NO")
    } else if (abs(y - b) == 1) {
        if (abs(x - a) == 2) println("YES") else println("NO")
    } else println("NO")
}