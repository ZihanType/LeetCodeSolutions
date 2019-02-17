fun maxProfit4(k: Int, prices: IntArray): Int {
    if (k > prices.size / 2) {
        var buy = Int.MIN_VALUE
        var benefit = 0

        repeat(prices.size) {
            buy = Math.max(buy, benefit - prices[it])
            benefit = Math.max(benefit, buy + prices[it])
        }

        return benefit
    }

    val buy = IntArray(k + 1) { Int.MIN_VALUE }
    val benefit = IntArray(k + 1)

    for (i in 0 until prices.size) {
        for (j in 1 until k + 1) {
            buy[j] = Math.max(buy[j], benefit[j - 1] - prices[i])
            benefit[j] = Math.max(benefit[j], buy[j] + prices[i])
        }
    }

    return benefit[k]
}
