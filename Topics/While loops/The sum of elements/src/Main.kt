fun main() {
    var result = 0

    while (true) {
        val num = readln().toInt()
        if (num == 0) break
        result += num
    }
    println(result)
}