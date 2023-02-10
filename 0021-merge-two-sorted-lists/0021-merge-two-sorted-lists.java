/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode headPre = new ListNode();
        ListNode movePre = headPre;
        
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                movePre.next = l1;
                l1 = l1.next;
            } else {
                movePre.next = l2;
                l2 = l2.next;
            }
            
            movePre = movePre.next;
        }
        
        movePre.next = l1 != null ? l1 : l2;
        
        return headPre.next;
    }
}