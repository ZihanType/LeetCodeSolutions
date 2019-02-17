fun countAndSay(n: Int): String {
    var result = ""
    var next: StringBuilder
    var count: Int

    repeat(n) {
        result = if (it == 0) {
            "1"
        } else {
            next = StringBuilder()
            count = 1
            for (index in 1 until result.length) {
                if (result[index] != result[index - 1]) {
                    next.append(count).append(result[index - 1])
                    count = 1
                } else {
                    count += 1
                }
            }
            next.append(count).append(result.last())
            next.toString()
        }
    }
    return result
}
