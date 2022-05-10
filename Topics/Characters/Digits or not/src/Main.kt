const val FOUR = 4

fun main() {
    val ch = ArrayList<Char>()
    repeat(FOUR) {
        ch.add(readln().first())
    }
    ch.forEach {
        println(it.isDigit())
    }
}