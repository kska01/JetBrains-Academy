fun main() {
    val range = readln().toLong() until readln().toLong()
    var result = 1L
    for (i in range) {
        result *= i
    }
    println(result)
}