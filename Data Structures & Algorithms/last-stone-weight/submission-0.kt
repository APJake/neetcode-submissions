class Solution {
    fun lastStoneWeight(stones: IntArray): Int {
        val queue = PriorityQueue<Int>(compareByDescending { it })

        for (s in stones) {
            queue.add(s)
        }
        while (queue.size > 1) {
            val result = abs(queue.poll() - queue.poll())
            queue.add(result)
        }

        return queue.poll()
    }
}
