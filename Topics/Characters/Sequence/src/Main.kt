const val THREE = 3

fun main() {
    val list = List(THREE) { readln().first() }

    println(list[0] + 1 == list[1] && list[0] + 2 == list[2])
}