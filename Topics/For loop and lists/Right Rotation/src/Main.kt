fun main() {
    val elementNumber = readln().toInt()
    val list = List(elementNumber) { readln().toInt() }
    val rotateNumber = readln().toInt() % elementNumber
    val resultList = MutableList(elementNumber) { 0 }

    for ((index, value) in list.withIndex()) {
        if (index + rotateNumber <= elementNumber - 1) {
            resultList[index + rotateNumber] = value
        } else {
            resultList[index + rotateNumber - elementNumber] = value
        }
    }

    println(resultList.joinToString(" "))
}