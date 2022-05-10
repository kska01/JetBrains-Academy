fun main() {
    val input = readln().first()
    println(input.isUpperCase() || input in '1'..'9')
}