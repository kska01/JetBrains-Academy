package tictactoe

import kotlin.math.abs

fun main() {
//    print("Enter cells:")
//    val str = readln().uppercase()
//    val arr = str.toCharArray()
//    var x = 0
//    var o = 0
//    var xCount = 0
//    var oCount = 0
//    println("""
//        ---------
//        | ${arr[0]} ${arr[1]} ${arr[2]} |
//        | ${arr[3]} ${arr[4]} ${arr[5]} |
//        | ${arr[6]} ${arr[7]} ${arr[8]} |
//        ---------
//        """.trimIndent())
//    for (v in 0..6 step 3) {
//        if (arr[v] == 'X' && arr[v + 1] == 'X' && arr[v + 2] == 'X') x = 1
//        if (arr[v] == 'O' && arr[v + 1] == 'O' && arr[v + 2] == 'O') o = 1
//    }
//    for (v in 0..2) {
//        if (arr[v] == 'X' && arr[v + 3] == 'X' && arr[v + 6] == 'X') x = 1
//        if (arr[v] == 'O' && arr[v + 3] == 'O' && arr[v + 6] == 'O') o = 1
//    }
//    for (v in 0..8) {
//        if (arr[v] == 'X') xCount++
//        if (arr[v] == 'O') oCount++
//    }
//    if (arr[0] == 'X' && arr[4] == 'X' && arr[8] == 'X') x =1
//    if (arr[0] == 'O' && arr[4] == 'O' && arr[8] == 'O') o = 1
//    if (arr[2] == 'X' && arr[4] == 'X' && arr[6] == 'X') x =1
//    if (arr[2] == 'O' && arr[4] == 'O' && arr[6] == 'O') o = 1
//
//    println(
//        if (x == 1 && o == 1 && arr.contains('_') || abs(xCount - oCount) >= 2) {
//            "Impossible"
//        } else if (x == 0 && o == 0 && arr.contains('_')) {
//            "Game not finished"
//        } else if (x == 1 && o == 0 ) {
//            "X wins"
//        } else if (x == 0 && o == 1) {
//            "O wins"
//        } else {
//            "Draw"
//        }
//    )

    print("Enter cells:")
    val str = readln().uppercase()
    val list = str.toMutableList()
    var x = 0
    var o = 0
    var xCount = 0
    var oCount = 0
    var result = ""
    println("""
        ---------
        | ${list[0]} ${list[1]} ${list[2]} |
        | ${list[3]} ${list[4]} ${list[5]} |
        | ${list[6]} ${list[7]} ${list[8]} |
        ---------
        """.trimIndent())
    for (v in 0..6 step 3) {
        if (list[v] == 'X' && list[v + 1] == 'X' && list[v + 2] == 'X') x = 1
        if (list[v] == 'O' && list[v + 1] == 'O' && list[v + 2] == 'O') o = 1
    }
    for (v in 0..2) {
        if (list[v] == 'X' && list[v + 3] == 'X' && list[v + 6] == 'X') x = 1
        if (list[v] == 'O' && list[v + 3] == 'O' && list[v + 6] == 'O') o = 1
    }
    for (v in 0..8) {
        if (list[v] == 'X') xCount++
        if (list[v] == 'O') oCount++
    }
    if (list[0] == 'X' && list[4] == 'X' && list[8] == 'X') x =1
    if (list[0] == 'O' && list[4] == 'O' && list[8] == 'O') o = 1
    if (list[2] == 'X' && list[4] == 'X' && list[6] == 'X') x =1
    if (list[2] == 'O' && list[4] == 'O' && list[6] == 'O') o = 1

    if (x == 1 && o == 1 && list.contains('_') || abs(xCount - oCount) >= 2) {
        result = "Impossible"
    } else if (x == 0 && o == 0 && list.contains('_')) {
        result = "Game not finished"
    } else if (x == 0 && o == 0 && xCount + oCount == 9) {
        result = "Draw"
    } else if (x == 1 && o == 0 ) {
        result = "X wins"
    } else if (x == 0 && o == 1) {
        result = "O wins"
    }

    println(result)
}