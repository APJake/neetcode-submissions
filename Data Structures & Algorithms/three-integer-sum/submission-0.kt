class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val size = nums.size
        val result = mutableSetOf<List<Int>>()
        val sorted = nums.toList().sorted()
        val mapper = mutableMapOf<Int, Int>()
        val max = 3001

        for (i in 0 until size - 2) {
            var j = i + 1
            var k = size - 1

            while (j < k) {
                
                val sum = sorted[i] + sorted[j] + sorted[k]
                
                when {
                    sum == 0 -> {
                        result.add(listOf(sorted[i], sorted[j], sorted[k]))
                        if (j < k - 1 && sorted[k-1] == sorted[k]) k--
                        else if (j+1 < k && sorted[j+1] == sorted[j]) j++
                        else if (j+1 < k) j++
                        else k--
                    }
                    sum > 0 -> k--
                    sum < 0 -> j++
                }
            }
        }

        return result.toList()
    }
}

// -4, -1, -1, 0, 1, 2

