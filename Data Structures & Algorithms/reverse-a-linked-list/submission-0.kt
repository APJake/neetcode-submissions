/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        var prev: ListNode? = null
        var current = head
        while (current != null) {
            val next = current?.next
            current?.next = prev
            prev = current
            current = next
        }
        return prev
    }
}

/*
1->2->3->n
=> n<-1<-2<-3

1->n

*/
