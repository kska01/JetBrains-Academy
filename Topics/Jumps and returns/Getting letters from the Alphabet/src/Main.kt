fun main() {
    val letter = readln()

    for (ch in 'a'..'z') {
        if (ch.toString() != letter) print(ch) else return
    }
}