fun main() {
    val list = List(readln().toInt()) { readln() }
    val (p, m) = readln().split(" ")
    var result = "YES"

    for (i in 0 until list.size - 1) {
        if (list[i] == p && list[i + 1] == m || list[i] == m && list[i + 1] == p) {
            result = "NO"
        }
    }

    println(result)
}