fun main() {
    val (str, num) = readln().split(" ")

    if (str.length < num.toInt()) {
        println(str)
    } else {
        println(str.substring(num.toInt(), str.length) + str.substring(0, num.toInt()))
    }
}