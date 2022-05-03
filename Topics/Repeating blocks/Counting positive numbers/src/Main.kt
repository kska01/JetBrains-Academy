fun main() {
    val n = readln().toInt()
    var pos = 0

    repeat(n) {
        if (readln().toInt() > 0) pos++
    }

    println(pos)
}
