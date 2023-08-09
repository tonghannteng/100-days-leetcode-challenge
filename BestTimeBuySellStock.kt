package leetcode

/**
 * @author: tonghann.teng
 * @since: 8/9/23 (Day 1)
 * @link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
fun maxProfit(prices: IntArray): Int {
    var min = Int.MAX_VALUE
    var result = 0
    for(i in prices.indices) {
        if (prices[i] < min) {
            min = Math.min(min, prices[i])
        } else {
            result = Math.max(result, prices[i] - min)
        }
    }
    return result
}
