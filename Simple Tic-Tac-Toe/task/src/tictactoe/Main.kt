package tictactoe

import kotlin.math.abs

fun main() {
    println(
        """
        ---------
        |       |
        |       |
        |       |
        ---------
        """.trimIndent()
    )

    var row = ""
    var col = ""
    var r = 0
    var c = 0
    var count = 0

    val list = MutableList(3) { MutableList(3) { ' ' } }

    do {
        do {
            print("Enter the coordinates: ")
            val input = readln()
            row = input.split(' ').first()
            col = input.split(' ').last()

            if (row in "0123456789" && col in "0123456789") {
                if (row in "123" && col in "123") {
                    r = row.toInt()
                    c = col.toInt()
                    if (list[r - 1][c - 1] == 'X' || list[r - 1][c - 1] == 'O') {
                        println("This cell is occupied! Choose another one!")
                    }
                } else {
                    println("Coordinates should be from 1 to 3!")
                }
            } else {
                println("You should enter numbers!")
            }


        } while (r !in 1..3 || c !in 1..3 || list[r - 1][c - 1] == 'X' || list[r - 1][c - 1] == 'O')

        r -= 1
        c -= 1
        count += 1

        if (count % 2 == 0) {
            list[r][c] = 'O'
        } else {
            list[r][c] = 'X'
        }

        println(
            """
        ---------
        | ${list[0][0]} ${list[0][1]} ${list[0][2]} |
        | ${list[1][0]} ${list[1][1]} ${list[1][2]} |
        | ${list[2][0]} ${list[2][1]} ${list[2][2]} |
        ---------
        """.trimIndent()
        )
    } while (checkResult(list) != "X wins" && checkResult(list) != "O wins" && checkResult(list) != "Draw"
        && checkResult(list) != "Impossible"
    )

    println(checkResult(list))
}

fun checkResult(list: MutableList<MutableList<Char>>): String {
    var x = 0
    var o = 0
    var xCount = 0
    var oCount = 0
    var result = ""

    // row check
    for (v in 0..2) {
        if (list[v][0] == 'X' && list[v][1] == 'X' && list[v][2] == 'X') x = 1
        if (list[v][0] == 'O' && list[v][1] == 'O' && list[v][2] == 'O') o = 1
    }

    // column check
    for (v in 0..2) {
        if (list[0][v] == 'X' && list[1][v] == 'X' && list[2][v] == 'X') x = 1
        if (list[0][v] == 'O' && list[1][v] == 'O' && list[2][v] == 'O') o = 1
    }

    // x and o count
    for (i in 0..2) {
        for (j in 0..2) {
            if (list[i][j] == 'X') xCount++
            if (list[i][j] == 'O') oCount++
        }
    }

    // diagonal check
    if (list[0][0] == 'X' && list[1][1] == 'X' && list[2][2] == 'X') x = 1
    if (list[0][0] == 'O' && list[1][1] == 'O' && list[2][2] == 'O') o = 1
    if (list[0][2] == 'X' && list[1][1] == 'X' && list[2][0] == 'X') x = 1
    if (list[0][2] == 'O' && list[1][1] == 'O' && list[2][0] == 'O') o = 1

    // evaluate
    if (x == 1 && o == 1 && list.contains(mutableListOf(' ')) || abs(xCount - oCount) >= 2) {
        result = "Impossible"
    } else if (x == 0 && o == 0 && list.contains(mutableListOf(' '))) {
        result = "Game not finished"
    } else if (x == 1 && o == 0) {
        result = "X wins"
    } else if (x == 0 && o == 1) {
        result = "O wins"
    } else if (x == 1 && o == 1) {
        result = "Draw"
    }

    return result
}