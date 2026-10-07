class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val history = mutableMapOf<Int, Int>()
        for ((i,n) in nums.withIndex()) {
            val partner = target - n
            if (history[partner] != null) {
                return intArrayOf(history[partner]!!, i)
            }
            history[n] = i
        }
        return intArrayOf(0,1)
    }
}
