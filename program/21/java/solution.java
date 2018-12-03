/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (null == l1) {
            return l2;
        }
        if (null == l2) {
            return l1;
        }
        int v1 = l1.val;
        int v2 = l2.val;
        if (v1 <= v2) {
            ListNode ln = new ListNode(v1);
            ln.next = mergeTwoLists(l1.next, l2);
            return ln;
        } else {
            ListNode ln = new ListNode(v2);
            ln.next = mergeTwoLists(l1, l2.next);
            return ln;
        }
    }
}
