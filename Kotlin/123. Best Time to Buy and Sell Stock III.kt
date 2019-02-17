fun maxProfit3(prices: IntArray): Int {
    if (prices.isEmpty())
        return 0

    var buy1 = Int.MIN_VALUE
    var buy2 = Int.MIN_VALUE
    var benefit1 = 0
    var benefit2 = 0

    repeat(prices.size) {
        buy1 = Math.max(buy1, -prices[it])
        benefit1 = Math.max(benefit1, prices[it] + buy1)
        buy2 = Math.max(buy2, benefit1 - prices[it])
        benefit2 = Math.max(benefit2, prices[it] + buy2)
    }

    return benefit2
}
