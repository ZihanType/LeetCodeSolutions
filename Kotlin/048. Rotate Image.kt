fun rotate(matrix: Array<IntArray>) {
    val n = matrix.size
    var temp: Int

    // 沿主对角线交换
    for (i in 0 until n) {
        for (j in i + 1 until n) {
            temp = matrix[i][j]
            matrix[i][j] = matrix[j][i]
            matrix[j][i] = temp
        }
    }

    // 沿纵轴左右交换
    for (i in 0 until n) {
        for (j in 0 until n / 2) {
            temp = matrix[i][j]
            matrix[i][j] = matrix[i][n - 1 - j]
            matrix[i][n - 1 - j] = temp
        }
    }
}
