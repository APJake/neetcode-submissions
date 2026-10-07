class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        var total = 1
        val zeroRoom = mutableMapOf<Int, Boolean>()
        var totalZero = 0
        nums.forEach { n -> 
            if (n == 0) {
                zeroRoom[n] = true
                totalZero += 1
            }
            else total *= n
        }
        val hasTwoZeros = totalZero > 1
        val hasZero = totalZero > 0
        val output = nums.map { n ->
            when {
                hasTwoZeros -> 0
                hasZero && zeroRoom[n] == true -> total
                hasZero -> 0
                else -> (total/n).toInt()
            }
        }
        return output.toIntArray()
    }
}
