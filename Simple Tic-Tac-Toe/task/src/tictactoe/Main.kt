package tictactoe

fun main() {
    val str = readln()
    val charArray = str.toCharArray()
    println("""
        ---------
        | ${charArray[0]} ${charArray[1]} ${charArray[2]} |
        | ${charArray[3]} ${charArray[4]} ${charArray[5]} |
        | ${charArray[6]} ${charArray[7]} ${charArray[8]} |
        ---------
        """.trimIndent())
}