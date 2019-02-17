fun reverse(x: Int): Int {
    var x = x
    var result = 0
    var pop: Int
    while (x != 0) {
        pop = x % 10
        x /= 10
        if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && pop > 7)) return 0
        if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && pop < -8)) return 0
        result = result * 10 + pop
    }
    return result
}

fun reverse2(x: Int): Int {
    var x = x
    var result = 0
    var tmp: Int
    while (x != 0) {
        // 因为都是用int型的，如果超出了范围，其除以10的结果就不会跟之前的结果一致，通过这点也可以进行区分
        tmp = result * 10 + x % 10
        if (tmp / 10 != result) return 0
        result = tmp
        x /= 10
    }
    return result
}
