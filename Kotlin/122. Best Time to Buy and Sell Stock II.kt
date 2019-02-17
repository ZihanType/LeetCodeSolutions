fun maxProfit2(prices: IntArray): Int {
    var benefit = 0
    var temp: Int

    for (index in 1 until prices.size) {
        temp = prices[index] - prices[index - 1]
        if (temp > 0)
            benefit += temp
    }

    return benefit
}
