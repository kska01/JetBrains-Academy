const val PERCENTAGE = 0.01

fun main() {
    val num = readln().toInt()
    val listOfCompanies = MutableList(num) { readln().toInt() }
    val taxLIst = MutableList(num) { readln().toInt() }
    var tax = 0.0
    var index = 0
    for ((i, v) in listOfCompanies.withIndex()) {
        if (v * taxLIst[i] * PERCENTAGE > tax) {
            tax = v * taxLIst[i] * PERCENTAGE
            index = i
        }
    }
    println(index + 1)
}