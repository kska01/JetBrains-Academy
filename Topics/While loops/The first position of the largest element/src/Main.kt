import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val list = mutableListOf<Int>()
    while (sc.hasNext()) {
        list.add(sc.nextInt())
    }
    println("${list.maxOrNull()} ${list.indexOf(list.maxOrNull()) + 1}")
}