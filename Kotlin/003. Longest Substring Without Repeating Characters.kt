fun lengthOfLongestSubstring(s: String): Int {
    var length = 0
    var start = 0
    val map = HashMap<Char, Int>()

    for (index in 0 until s.length) {
        start = Math.max(start, (map[s[index]] ?: -1) + 1)
        length = Math.max(length, index - start + 1)
        map[s[index]] = index
    }

    return length
}
