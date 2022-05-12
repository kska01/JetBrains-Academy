fun main() {
    val list = MutableList(readln().toInt()) { readln().toInt() }
    val (p, m) = readln().split(' ').map { it.toInt() }
    println(
        if (p in list && m in list) {
            "YES"
        } else {
            "NO"
        }
    )
}