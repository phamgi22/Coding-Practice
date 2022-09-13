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
    public int pairSum(ListNode head) {
        int n = 0;
        int j = 0;
        int result = 0;
        ListNode p = head;
        ListNode dummy = head;
        
        while (dummy.next != null) {
            n++;
            dummy = dummy.next;
        }
        
        int[] arr = new int[n+1];
        while (p.next != null) {
            arr[j] = p.val;
            j++;
            p = p.next;
        }
        
        arr[j] = p.val;
        for (int i = 0; i < arr.length / 2; i++) {
            int sum = arr[i] + arr[arr.length-1-i];
            result = Math.max(result, sum);
        }
        
        return result;
    }
}