class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var left = 0
        var right = 0
        val memo = mutableMapOf<Char, Int>()
        var best = 0

        while (right < s.length) {
            val c = s[right]
            var shouldLoop = false
            var count = memo.getOrDefault(c, 0) + 1
            memo[c] = count

            while (count > 1) {
                val oldC = s[left]
                val currentCount = memo.getOrDefault(oldC, 0) - 1
                if (currentCount > 0) {
                    memo[oldC] = currentCount
                } else {
                    memo.remove(oldC)
                }
                
                if (oldC == c) {
                    count = currentCount
                }
                left++
            }
            best = maxOf(best, memo.size)
            right++
        }

        return best
    }
}
