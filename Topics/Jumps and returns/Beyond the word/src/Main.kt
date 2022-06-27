fun main() {
    val str = readln()

    for (ch in 'a'..'z') {
        if (ch !in str) print(ch)
    }
}