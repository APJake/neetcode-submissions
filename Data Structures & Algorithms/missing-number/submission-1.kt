class Solution {
    fun missingNumber(nums: IntArray): Int {
        val sorted = nums.sorted()
        for (i in (0..nums.size)) {
            if (i >= sorted.size) return i
            if (i != sorted[i]) return i
        }
        return nums.size
    }
}
 