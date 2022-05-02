fun main() {
    var a = readln().toInt()
    var b = readln().toInt()
    var c = readln().toInt()

    a = checkNumber(a)
    b = checkNumber(b)
    c = checkNumber(c)

    println(a + b + c == 1)
}
fun checkNumber(n: Int): Int {
    return if (n > 0) 1 else 0
}