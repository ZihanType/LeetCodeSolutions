fun myAtoi(str: String): Int {
    var index = 0
    var sign = 1
    var total = 0
    var digit: Int

    // 1.判断是否为空，为空则返回 0
    if (str.isEmpty()) return 0

    // 2.移除空格
    while (index < str.length && str[index] == ' ')
        index++

    // 3.处理+、-
    if (index < str.length && str[index] == '+') {
        sign = 1
        index++
    } else if (index < str.length && str[index] == '-') {
        sign = -1
        index++
    }

    // 4.将字符串转换成数字，并避免溢出
    while (index < str.length) {
        digit = str[index] - '0'
        if (digit !in 0..9) break

        if (Int.MAX_VALUE / 10 < total // total * 10 > Int.MAX_VALUE
            ||
            (Int.MAX_VALUE / 10 == total && Int.MAX_VALUE % 10 < digit) // 10 * total + digit > Int.MAX_VALUE
        )
            return if (sign == 1) Int.MAX_VALUE else Int.MIN_VALUE

        total = 10 * total + digit
        index++
    }

    return total * sign
}
