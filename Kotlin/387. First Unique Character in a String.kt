fun firstUniqChar1(s: String): Int {
    val count = IntArray(26)
    var char: Char

    repeat(s.length) {
        char = s[it]
        count[char - 'a']++
    }

    repeat(s.length) {
        char = s[it]
        if (count[char - 'a'] == 1) {
            return it
        }
    }

    return -1
}

fun firstUniqChar2(s: String): Int {
    val map = mutableMapOf<Char, Int>()
    var char: Char

    repeat(s.length) {
        char = s[it]
        map[char] = (map[char] ?: 0) + 1
    }

    repeat(s.length) {
        char = s[it]
        if (map[char] == 1) return it
    }

    return -1
}
