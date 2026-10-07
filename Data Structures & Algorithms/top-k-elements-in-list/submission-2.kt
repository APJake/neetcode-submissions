class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val memory = mutableMapOf<Int, Int>()

        for (n in nums) {
            memory[n] = memory.getOrDefault(n, 0) + 1
        }

        return memory
        .toList()
        .sortedByDescending { (_, counts) -> counts }
        .subList(0, k)
        .map { (key, _) -> key }
        .toIntArray()
    }
}