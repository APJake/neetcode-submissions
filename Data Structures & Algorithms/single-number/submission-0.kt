class Solution {
    fun singleNumber(nums: IntArray): Int {
        val sorted = nums.sorted()
        var cursor = sorted.first()
        var flag = true
        for (i in 1 until sorted.size) {
            if (sorted[i] != cursor) {
                if (flag) return cursor
                cursor = sorted[i]
                flag = true
            } else {
                flag = false
            }
        }
        return cursor
    }
}
