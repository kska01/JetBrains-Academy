package tictactoe

import kotlin.math.abs

fun main() {
    print("Enter cells:")
    val str = readln().uppercase()
    val arr = str.toCharArray()
    var x = 0
    var o = 0
    var xCount = 0
    var oCount = 0
    println("""
        ---------
        | ${arr[0]} ${arr[1]} ${arr[2]} |
        | ${arr[3]} ${arr[4]} ${arr[5]} |
        | ${arr[6]} ${arr[7]} ${arr[8]} |
        ---------
        """.trimIndent())
    for (v in 0..6 step 3) {
        if (arr[v] == 'X' && arr[v + 1] == 'X' && arr[v + 2] == 'X') x = 1
        if (arr[v] == 'O' && arr[v + 1] == 'O' && arr[v + 2] == 'O') o = 1
    }
    for (v in 0..2) {
        if (arr[v] == 'X' && arr[v + 3] == 'X' && arr[v + 6] == 'X') x = 1
        if (arr[v] == 'O' && arr[v + 3] == 'O' && arr[v + 6] == 'O') o = 1
    }
    for (v in 0..8) {
        if (arr[v] == 'X') xCount++
        if (arr[v] == 'O') oCount++
    }
    if (arr[0] == 'X' && arr[4] == 'X' && arr[8] == 'X') x =1
    if (arr[0] == 'O' && arr[4] == 'O' && arr[8] == 'O') o = 1
    if (arr[2] == 'X' && arr[4] == 'X' && arr[6] == 'X') x =1
    if (arr[2] == 'O' && arr[4] == 'O' && arr[6] == 'O') o = 1

    println(
        if (x == 1 && o == 1 && arr.contains('_') || abs(xCount - oCount) >= 2) {
            "Impossible"
        } else if (x == 0 && o == 0 && arr.contains('_')) {
            "Game not finished"
        } else if (x == 1 && o == 0 ) {
            "X wins"
        } else if (x == 0 && o == 1) {
            "O wins"
        } else {
            "Draw"
        }
    )
}