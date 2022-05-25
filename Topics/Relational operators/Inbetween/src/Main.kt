fun main() {
    val value = readln().toInt()
    val range = MutableList(2) { readln().toInt() }.sorted()
    if (value in range[0]..range[1]) println("true") else println("false")
}