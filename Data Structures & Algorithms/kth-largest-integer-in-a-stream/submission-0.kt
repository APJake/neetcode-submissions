class KthLargest(
    private val k: Int, 
    private val nums: IntArray
) {
    private val queue = PriorityQueue<Int>()

    init {
        for (n in nums) {
            queue.add(n)
        }
        while (queue.size > k) queue.poll()
    }

    fun add(`val`: Int): Int {
        queue.add(`val`)
        if (queue.size > k) queue.poll()
        return queue.peek()
    }
}
