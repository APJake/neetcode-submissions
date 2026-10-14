class Solution {
    fun squareIndex(r: Int, c: Int): Int {
        return ((r/3)*3) + (c/3)
    }

    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val size = 9
        val columns = Array(size) { mutableMapOf<Char, Boolean>() }
        val rows = Array(size) { mutableMapOf<Char, Boolean>() }
        val squares = Array(size) { mutableMapOf<Char, Boolean>() }
        
        for (r in 0 until size) {
            for (c in 0 until size) {
                val cell = board[r][c]
                if (cell == '.') continue
                // check from colums
                if (columns[c].getOrDefault(cell, false)) return false
                columns[c][cell] = true

                // check from rows
                if (rows[r].getOrDefault(cell, false)) return false
                rows[r][cell] = true

                // check from squares
                val s = squareIndex(r, c)
                if(squares[s].getOrDefault(cell, false)) return false
                squares[s][cell] = true
            }
        }

        return true
    }
}
