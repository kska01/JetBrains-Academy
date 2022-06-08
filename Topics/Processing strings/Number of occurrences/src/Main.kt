fun main() {
    val string = readln()
    val substring = readln()
    val list = string.split(substring)

    println(list.lastIndex)
}