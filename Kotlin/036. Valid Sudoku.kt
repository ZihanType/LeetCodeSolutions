fun isValidSudoku(board: Array<CharArray>): Boolean {
    val rows = mutableSetOf<Char>()
    val columns = mutableSetOf<Char>()
    val cube = mutableSetOf<Char>()
    var element: Char

    // 遍历每一列，每一行，每一方块
    for (i in 0..8) {

        // 遍历该列，该行，该方块
        for (j in 0..8) {
            element = board[i][j]
            if (element != '.' && !rows.add(element))
                return false

            element = board[j][i]
            if (element != '.' && !columns.add(element))
                return false

            element = board[j / 3 + i / 3 * 3][j % 3 + i % 3 * 3]
            if (element != '.' && !cube.add(element))
                return false
        }

        rows.clear()
        columns.clear()
        cube.clear()
    }

    return true
}
