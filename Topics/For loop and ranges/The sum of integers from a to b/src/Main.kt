fun main() {
    val range = readln().toInt()..readln().toInt()
    var sum = 0
    for (i in range) {
        sum += i
    }
    println(sum)
}