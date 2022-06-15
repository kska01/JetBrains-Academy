package tictactoe

import kotlin.math.abs

fun main() {
    print("Enter cells: ")
    val str = readln().uppercase()
//    val arr = str.toCharArray()

    val list = mutableListOf(
        mutableListOf(str[0], str[1], str[2]),
        mutableListOf(str[3], str[4], str[5]),
        mutableListOf(str[6], str[7], str[8])
    )

//    var x = 0
//    var o = 0
//    var xCount = 0
//    var oCount = 0
    println(
        """
        ---------
        | ${list[0][0]} ${list[0][1]} ${list[0][2]} |
        | ${list[1][0]} ${list[1][1]} ${list[1][2]} |
        | ${list[2][0]} ${list[2][1]} ${list[2][2]} |
        ---------
        """.trimIndent()
    )
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

    var row = " "
    var col = " "
    var y = 0
    var x = 0

    do {
        print("Enter the coordinates: ")
        val input = readln()
        row = input.split(' ').first()
        col = input.split(' ').last()

        if (row in "0123456789" && col in "0123456789") {
            if (row in "123" && col in "123") {
                y = row.toInt()
                x = col.toInt()
                if (list[y - 1][x - 1] == 'X' || list[y - 1][x - 1] == 'O') {
                    println("This cell is occupied! Choose another one!")
                }
            } else {
                println("Coordinates should be from 1 to 3!")
            }
        } else {
            println("You should enter numbers!")
        }


    } while (y !in 1..3 || x !in 1..3 || list[y - 1][x - 1] == 'X' || list[y - 1][x - 1] == 'O')

    y -= 1
    x -= 1
    list[y][x] = 'X'

    println(
        """
        ---------
        | ${list[0][0]} ${list[0][1]} ${list[0][2]} |
        | ${list[1][0]} ${list[1][1]} ${list[1][2]} |
        | ${list[2][0]} ${list[2][1]} ${list[2][2]} |
        ---------
        """.trimIndent()
    )
}