fun main() {
    val x = readLine().toBoolean() // read other values in the same way
    val y = readln().toBoolean()
    val z = readln().toBoolean()

    println(!(x && y) || z)
}