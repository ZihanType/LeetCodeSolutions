fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) return false
    if (s.isEmpty() && t.isEmpty()) return true

    val map1 = mutableMapOf<Char, Int>()
    val map2 = mutableMapOf<Char, Int>()
    var char: Char
    val len = s.length

    repeat(len) {
        char = s[it]
        map1[char] = (map1[char] ?: 0) + 1
        char = t[it]
        map2[char] = (map2[char] ?: 0) + 1
    }

    repeat(len) {
        char = s[it]
        if (map1[char] != map2[char]) return false
    }

    return true
}
