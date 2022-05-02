const val OBJECTIVE = 20

fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    println(a + b == OBJECTIVE || a + c == OBJECTIVE || b + c == OBJECTIVE)
}