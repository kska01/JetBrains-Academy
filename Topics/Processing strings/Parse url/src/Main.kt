fun main() {
    val (protocol, parameter) = readln().split('?')
    val list = parameter
        .replace("=&", "=not found&")
        .replace("=", " : ")
        .split('&')

    repeat(list.size) {
        println(list[it])
    }

    for (value in list) {
        if ("pass" in value) {
            val password = value.replace("pass", "password")
            println(password)
        }
    }
}