fun main() {
    val n = readln().toInt()
    val list = MutableList(n) { readln().toInt() }
    if (n == 1) {
        println(list[0])
    } else {
        repeat(n - 1) {
            for (i in 0 until n - 1) {
                if (list[i] > list[i + 1]) {
                    var tmp = 0
                    tmp = list[i]
                    list[i] = list[i + 1]
                    list[i + 1] = tmp
                }
            }
        }
        println(list.last() * list[list.lastIndex - 1])
    }
}