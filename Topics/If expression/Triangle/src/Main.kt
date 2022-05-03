fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    var max = if (a > b) a else b
    max = if (max > c) max else c

    if (max == a) {
        if (a < b + c) println("YES") else println("NO")
    } else if (max == b) {
        if (b < a + c) println("YES") else println("NO")
    } else {
        if (c < a + b) println("YES") else println("NO")
    }
}