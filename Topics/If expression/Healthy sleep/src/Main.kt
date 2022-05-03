fun main() {    
    val a = readln().toInt()
    val b = readln().toInt()
    val h = readln().toInt()

    if (h in a..b) {
        println("Normal")
    } else if (h < a) {
        println("Deficiency")
    } else println("Excess")
}