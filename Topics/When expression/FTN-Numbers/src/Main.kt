fun main() {
    val f = listOf("0", "1", "2", "3", "5", "8", "13", "21", "34", "55")
    val t = listOf("3", "6", "10", "15", "21", "28", "36", "45")
    val p = listOf("10", "100", "1000", "10000", "100000")

    println(
        when (readln()) {
            in f -> "F"
            in t -> "T"
            in p -> "P"
            else -> "N"
        }
    )
}