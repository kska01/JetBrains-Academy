fun isVowel(letter: Char): Boolean {
    val vowel = listOf('a', 'e', 'i', 'o', 'u')
    return vowel.contains(letter.lowercaseChar())
}

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}