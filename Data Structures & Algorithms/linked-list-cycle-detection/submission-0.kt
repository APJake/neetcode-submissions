/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun hasCycle(head: ListNode?): Boolean {
        val memo = mutableMapOf<Int, Boolean>()
        var current = head
        while (current != null) {
            val id = System.identityHashCode(current!!)
            if (memo[id] == true) return true
            memo[id] = true
            current = current?.next
        }

        return false
    }
}
