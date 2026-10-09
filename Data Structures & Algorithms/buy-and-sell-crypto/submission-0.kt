class Solution {
    fun maxProfit(prices: IntArray): Int {
        var max = 0
        var first = prices[0]

        for (i in (1..prices.size-1)) {
            val p = prices[i]
            val diff = p-first
            if (diff < 0) {
                first = p
                continue
            }
            if (diff > max) {
                max = diff
            }
        }
        return max
    }
}
// [10,5,6,1,7,1]