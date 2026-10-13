class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        val size = numbers.size
        var i = 0
        var j = size - 1

        while (i < size - 1 && j > 0) {
            val sum = numbers[i] + numbers[j]
            if (sum > target) {
                // last one is so big
                j--
                continue
            }

            if (sum < target) {
                // first one is so small
                i++
                continue
            }

            if (sum == target) return intArrayOf(i+1, j+1)
        }

        return intArrayOf(0,0)
    }
}
