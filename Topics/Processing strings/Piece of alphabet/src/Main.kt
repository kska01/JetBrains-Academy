fun isOrdered(str: String): Boolean {
    var count = 0

    for (i in 0 until str.length - 1) {
        if (str[i] + 1 != str[i + 1]) count++
    }

    return count == 0
}

fun main() {
    val input = readln()

    if (input.length <= 1) {
        println("true")
    } else {
        println(isOrdered(input))
    }
}