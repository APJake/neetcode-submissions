class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        var max = 0
        var counter = 1

        nums.sort()

        var prev = nums[0]

        val len = nums.size
        for (i in (1..len - 1)) {
            val cur = nums[i]
            if (cur == prev) {
                // skip
                continue
            } else if (cur - prev == 1) {
                counter += 1
            } else {
                if (counter >= max) {
                    max = counter
                }
                counter = 1
            }
            prev = cur
        }

        return if (counter >= max) counter else max
    }
}
