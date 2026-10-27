/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var cur1 = list1
        var cur2 = list2
        val v1 = cur1?.`val` ?: 101
        val v2 = cur2?.`val` ?: 101
        val value = if (v1 < v2) {
            cur1 = cur1?.next
            v1
        } else {
            cur2 = cur2?.next
            v2
        }
        if (value > 100) return null

        val root = ListNode(value)
        var cur: ListNode? = root

        while (cur1 != null || cur2 != null) {
            val v1 = cur1?.`val` ?: 101
            val v2 = cur2?.`val` ?: 101

            if (v1 < v2) {
                val tmp = ListNode(v1)
                cur?.next = tmp
                cur = tmp
                cur1 = cur1?.next
            } else {
                val tmp = ListNode(v2)
                cur?.next = tmp
                cur = tmp
                cur2 = cur2?.next
            }
        }

        return root
    }
}

/*
null
1->3->5
2->3->4

1->null
3->5
2->3->4

1->2->null

*/
