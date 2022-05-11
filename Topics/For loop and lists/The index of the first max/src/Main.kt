fun main() {
    val list = MutableList(readln().toInt()) { readln().toInt() }
    val max = list.maxOrNull()
    for ((index, value) in list.withIndex()) {
        if (value == max) {
            println(index)
            break
        }
    }
}