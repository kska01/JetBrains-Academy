fun main() {
    val input = readln().toInt()
    var num = 1
    var count = 0
    while (num <= input) {
        var subNum = 0
        while (subNum < num) {
            print("$num ")
            subNum++
            count++
            if (count == input) return
        }
        num++
    }
}