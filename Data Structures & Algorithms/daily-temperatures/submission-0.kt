class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val size = temperatures.size
        val stack = ArrayDeque<Int>()
        val result = IntArray(size)
        for (i in 0 until size) {
            while (stack.isNotEmpty() && temperatures[stack.last()] < temperatures[i]) {
                val idx = stack.removeLast()
                result[idx] = i - idx
            }
            stack.addLast(i)
        }

        return result
    }
}
/**

0,1,2,3,4
1,1,3,2,3
1,2,3,...
2,1,3,...


*/