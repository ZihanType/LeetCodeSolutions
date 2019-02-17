fun isPalindrome(s: String): Boolean {
    val s = s.toLowerCase().toCharArray()
    var start = 0
    var end = s.lastIndex

    while (start < end) {
        when {
            !s[start].isLetterOrDigit() -> start++
            !s[end].isLetterOrDigit() -> end--
            s[start] == s[end] -> {
                start++
                end--
            }
            s[start] != s[end] -> return false
        }
    }
    return true
}
