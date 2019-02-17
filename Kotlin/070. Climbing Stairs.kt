fun climbStairs(n: Int): Int {
    var x = 1
    var y = 2
    repeat(n - 1) {
        y = y + x
        x = y - x
    }
    return x
}

// 1  1
// 2  2
// 3  3
// 4  5
// 5  8
// 6  13
// 7  21
// 8  34