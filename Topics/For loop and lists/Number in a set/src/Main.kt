fun main() {
    val set = MutableList(readln().toInt()) { readln().toInt() }
    println(
        if (set.contains(readln().toInt())) "YES" else "NO"
    )
}