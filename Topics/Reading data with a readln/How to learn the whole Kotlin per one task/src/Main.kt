const val MAX = 5

fun main() {
    val a = mutableListOf<String>()
    repeat(MAX) {
        a.add(readln())
    }

    for (i in a) {
        print("$i ")
    }
}