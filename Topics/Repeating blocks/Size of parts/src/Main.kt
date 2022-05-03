fun main() {
    val n = readln().toInt()
    var larger = 0
    var smaller = 0
    var perfect = 0

    repeat(n) {
        val number = readln().toInt()
        if (number == 1) {
            larger++
        } else if (number == -1) {
            smaller++
        } else perfect++
    }

    println("$perfect $larger $smaller")
}