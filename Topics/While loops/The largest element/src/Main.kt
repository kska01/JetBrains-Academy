fun main() {
    var max = 0
    while (true) {
        val num = readln().toInt()
        if (num == 0) break
        if (num > max) max = num
    }
    println(max)
}