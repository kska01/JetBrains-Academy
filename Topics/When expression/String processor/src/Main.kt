const val THREE = 3

fun main() {
    val list = List(THREE) { readln() }

    println(
        when (list[1]) {
            "equals" -> list[0] == list[2]
            "plus" -> list[0] + list[2]
            "endsWith" -> list[0].endsWith(list[2])
            else -> "Unknown operation"
        }
    )
}