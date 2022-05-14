fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000
    println(
        "${totalSeconds % 86400 / 3600 % 24 + 9}" +
            ":${totalSeconds % 86400 % 3600 / 60}:${totalSeconds % 86200 % 3600 % 60}"
    )
}