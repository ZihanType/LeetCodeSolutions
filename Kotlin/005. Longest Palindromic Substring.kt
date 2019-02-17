fun longestPalindrome(s: String): String {
    if (s.isEmpty()) return ""
    var start = 0
    var end = 0
    for (i in 0 until s.length) {
        val len1 = expandAroundCenter(s, i, i)
        val len2 = expandAroundCenter(s, i, i + 1)
        val len = Math.max(len1, len2)
        if (len > end - start) {
            start = i - (len - 1) / 2
            end = i + len / 2
        }
    }
    return s.substring(start, end + 1)
}

private fun expandAroundCenter(s: String, left: Int, right: Int): Int {
    var left = left
    var right = right
    while (left >= 0 && right < s.length && s[left] == s[right]) {
        left--
        right++
    }
    return right - left - 1
}
