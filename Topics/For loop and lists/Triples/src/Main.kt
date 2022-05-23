const val THREE = 3

fun main() {
    val list = MutableList(readln().toInt()) { readln().toInt() }
    var count = 0
    for (i in 0..list.size - THREE) {
        if (list[i] + 1 == list[i + 1] && list[i + 1] + 1 == list[i + 2]) count++
    }
    println(count)
}