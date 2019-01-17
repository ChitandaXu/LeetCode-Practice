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
        if(head == null || head.next == null)
            return head;
        ListNode node = head, cur = head.next;
        while(cur != null) {
            if(cur.val != node.val) {
                node.next = cur;
                node = cur;
                cur = cur.next;
            } else {
                while(cur != null && cur.val == node.val) {
                    cur = cur.next;
                }
            }
        }
        node.next = cur;
        return head;
    }
}
