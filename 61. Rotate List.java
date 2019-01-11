/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null)
            return head;
        if(k <= 0)
            return head;
        int len = 0;
        ListNode cur = head;
        while(cur != null) {
            len++;
            cur = cur.next;
        }
        k = k % len;
        if(k == 0)
            return head;
        ListNode slow = head, fast = head;
        for(int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        ListNode newHead = slow.next;
        cur = newHead;
        slow.next = null;
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = head;
        return newHead;
    }
}
