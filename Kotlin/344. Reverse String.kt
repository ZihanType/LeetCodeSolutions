fun reverseString(s: String): String {
    val result = StringBuilder()
    val len = s.length

    repeat(len) {
        result.append(s[len - 1 - it])
    }

    return result.toString()
}
