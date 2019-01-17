/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy, cur = head;
        int value = cur.val;
        cur = cur.next;
        while(cur != null) {
            if(cur.val != value) {
                value = cur.val;
                cur = cur.next;
                pre = pre.next;
            } else {
                while(cur != null && cur.val == value) {
                    cur = cur.next;
                }
                pre.next = cur;
                if(cur != null) {
                    value = cur.val;
                    cur = cur.next;
                }
            }
        }
        return dummy.next;
    }
}
