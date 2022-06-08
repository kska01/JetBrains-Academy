fun main() {
    val list = readln().split(" ")
    var longest = ""

    for (word in list) {
        if (word.length > longest.length) longest = word
    }

    println(longest)
}