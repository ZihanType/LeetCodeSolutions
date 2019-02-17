fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty() || strs[0] == "") {
        return ""
    }

    var temp = strs[0]
    var min: Int

    for (outer in 1 until strs.size) {
        if (strs[outer].isEmpty()) {
            return ""
        }

        min = Math.min(strs[outer].length, temp.length)

        for (inner in 0 until min) {
            if (temp[inner] != strs[outer][inner]) {
                temp = strs[outer].substring(0, inner)
                break
            }
            if (inner == strs[outer].length - 1)
                temp = strs[outer]
        }
    }

    return temp
}
