fun plusOne(digits: IntArray): IntArray {
    (digits.size - 1 downTo 0).forEach {
        if (digits[it] < 9) {
            digits[it] += 1
            return digits
        }
        digits[it] = 0
    }

    val result = IntArray(digits.size + 1)
    result[0] = 1
    return result
}
