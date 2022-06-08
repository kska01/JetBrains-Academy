fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val n = readln().toInt()
    var count = 0

    for (v in a..b) {
        if (v % n == 0) count++
    }

    println(count)
}