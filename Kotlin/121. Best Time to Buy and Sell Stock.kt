fun maxProfit1(prices: IntArray): Int {
    if (prices.isEmpty())
        return 0

    var benefit = 0
    var minPrice = prices[0]

    repeat(prices.size) {
        benefit = Math.max(benefit, prices[it] - minPrice)
        minPrice = Math.min(minPrice, prices[it])
    }

    return benefit
}
