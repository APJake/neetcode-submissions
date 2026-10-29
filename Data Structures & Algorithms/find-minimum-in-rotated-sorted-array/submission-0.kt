class Solution {
    fun findMin(nums: IntArray): Int {
        val size = nums.size
        var min = nums.first()

        if (size == 1) return min
        if (size == 2) return min(min, nums.last())
        var l = 0
        var r = size - 1
        var m = size / 2

        if (nums[l] > nums[m]) {
                // special case, result should be m most
            while (nums[l] > nums[m])
                min = min(min, nums[m--])
            return min
        }

        if (nums[m] > nums[r]) {
            // spcial case, result should be r most
            while (nums[m] > nums[r])
                min = min(min, nums[r--])
            return min
        }

        // l -> m is grouped
        if (nums[l] < nums[m]) {
            // l -> m is smaller
            if (nums[l] < nums[m+1]) {
                return nums[l]
            } else {
                return nums[m+1]
            }
        }

        // m -> r is grouped
        // m -> r is smaller
        return if (nums[m] < nums[l]) {
            nums[m]
        } else nums[l]
    }
}
