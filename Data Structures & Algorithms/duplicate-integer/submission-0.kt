class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val numberHistory = mutableMapOf<Int, Boolean>()
        for (n in nums) {
            if (numberHistory[n] == true) return true
            numberHistory[n] = true
        }
        return false
    }
}
