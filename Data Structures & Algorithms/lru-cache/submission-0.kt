// cheating code

class LRUCache(private val capacity: Int) {

    
    private class Node(
        val key: Int,
        var value: Int
    ) {
        var prev: Node? = null
        var next: Node? = null
    }

    private val cache = HashMap<Int, Node>()

    // Dummy head and tail
    private val head = Node(-1, -1)
    private val tail = Node(-1, -1)

    init {
        head.next = tail
        tail.prev = head
    }

    fun get(key: Int): Int {
        val node = cache[key] ?: return -1

        // Move recently used node to the front
        remove(node)
        insertToFront(node)

        return node.value
    }

    fun put(key: Int, value: Int) {
        // Update existing key
        if (cache.containsKey(key)) {
            val node = cache[key]!!
            node.value = value

            remove(node)
            insertToFront(node)
            return
        }

        // Evict least recently used node
        if (cache.size >= this.capacity) {
            val lruNode = tail.prev!!
            remove(lruNode)
            cache.remove(lruNode.key)
        }

        // Insert new node
        val newNode = Node(key, value)
        cache[key] = newNode
        insertToFront(newNode)
    }

    private fun remove(node: Node) {
        val prev = node.prev!!
        val next = node.next!!

        prev.next = next
        next.prev = prev
    }

    private fun insertToFront(node: Node) {
        val first = head.next!!

        node.prev = head
        node.next = first

        head.next = node
        first.prev = node
    }

}
