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

    val grid = MutableList(3) { MutableList(3) { ' ' } }

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
                    if (grid[r - 1][c - 1] == 'X' || grid[r - 1][c - 1] == 'O') {
                        println("This cell is occupied! Choose another one!")
                    }
                } else {
                    println("Coordinates should be from 1 to 3!")
                }
            } else {
                println("You should enter numbers!")
            }


        } while (r !in 1..3 || c !in 1..3 || grid[r - 1][c - 1] == 'X' || grid[r - 1][c - 1] == 'O')

        r -= 1
        c -= 1
        count += 1

        if (count % 2 == 0) {
            grid[r][c] = 'O'
        } else {
            grid[r][c] = 'X'
        }

        println(
            """
        ---------
        | ${grid[0][0]} ${grid[0][1]} ${grid[0][2]} |
        | ${grid[1][0]} ${grid[1][1]} ${grid[1][2]} |
        | ${grid[2][0]} ${grid[2][1]} ${grid[2][2]} |
        ---------
        """.trimIndent()
        )
    } while (checkResult(grid) != "X wins" && checkResult(grid) != "O wins" && checkResult(grid) != "Draw"
        && checkResult(grid) != "Impossible"
    )

    println(checkResult(grid))
}

fun checkResult(grid: MutableList<MutableList<Char>>): String {
    var x = 0
    var o = 0
    var xCount = 0
    var oCount = 0
    var result = ""

    // row check
    for (v in 0..2) {
        if (grid[v][0] == 'X' && grid[v][1] == 'X' && grid[v][2] == 'X') x = 1
        if (grid[v][0] == 'O' && grid[v][1] == 'O' && grid[v][2] == 'O') o = 1
    }

    // column check
    for (v in 0..2) {
        if (grid[0][v] == 'X' && grid[1][v] == 'X' && grid[2][v] == 'X') x = 1
        if (grid[0][v] == 'O' && grid[1][v] == 'O' && grid[2][v] == 'O') o = 1
    }

    // x and o count
    for (i in 0..2) {
        for (j in 0..2) {
            if (grid[i][j] == 'X') xCount++
            if (grid[i][j] == 'O') oCount++
        }
    }

    // diagonal check
    if (grid[0][0] == 'X' && grid[1][1] == 'X' && grid[2][2] == 'X') x = 1
    if (grid[0][0] == 'O' && grid[1][1] == 'O' && grid[2][2] == 'O') o = 1
    if (grid[0][2] == 'X' && grid[1][1] == 'X' && grid[2][0] == 'X') x = 1
    if (grid[0][2] == 'O' && grid[1][1] == 'O' && grid[2][0] == 'O') o = 1

    // evaluate
    if (x == 1 && o == 1 && grid.contains(mutableListOf(' ')) || abs(xCount - oCount) >= 2) {
        result = "Impossible"
    } else if (x == 0 && o == 0 && grid.contains(mutableListOf(' '))) {
        result = "Game not finished"
    } else if (x == 0 && o == 0 && xCount + oCount == 9) {
        result = "Draw"
    } else if (x == 1 && o == 0) {
        result = "X wins"
    } else if (x == 0 && o == 1) {
        result = "O wins"
    }

    return result
}