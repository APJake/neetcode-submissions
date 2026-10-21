class Solution {
    fun search(nums: IntArray, target: Int): Int {
        val size = nums.size
        var min = 0
        var max = size - 1
        var i = max / 2
        while (i>=min && i<=max) {
            if (nums[i]>target) {
                // need to reduce
                val tmp = i
                i = min + ((i - min) / 2)
                max = tmp - 1
            } else if (nums[i]<target) {
                // need to move forward
                val tmp = i
                i = i + ((max-i+1)/2)
                min = tmp +1
            } else return i
        }
        return -1
    }
}
/*
0,1,2,3,4,5,6,7

3
(3-0)/2 = 1
(2-1)/2 = 0
*/
