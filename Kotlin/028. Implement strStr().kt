fun strStr(haystack: String, needle: String): Int {
    val len1 = haystack.length
    val len2 = needle.length
    var tmp: String

    for (i in 0..(len1 - len2)) {
        tmp = haystack.slice(i until (i + len2))
        if (tmp == needle) return i
    }

    return -1
}
