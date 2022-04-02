import java.util.Scanner

const val FIVE = 5

fun main() {
    val scanner = Scanner(System.`in`)
    for (i in 1..FIVE) {
        println(scanner.next())
    }
}