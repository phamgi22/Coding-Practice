/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { 
            this.val = val; }
 *     ListNode(int val, ListNode next) { 
            this.val = val; 
            this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy_head = new ListNode();
        ListNode l3 = dummy_head;
        
        int carry = 0;
        while (l1 != null || l2 != null) {
            int l1_val = (l1 != null) ? l1.val : 0;
            int l2_val = (l2 != null) ? l2.val : 0;
            
            int sum = l1_val + l2_val + carry;
            carry = sum / 10;
            int last_digit = sum % 10;
            
            ListNode nextNode = new ListNode(last_digit);
            l3.next = nextNode;
          
            if  (l1 != null) l1 = l1.next;
            if  (l2 != null) l2 = l2.next;
            l3 = l3.next;
        }
        
        if (carry > 0) {
            ListNode last = new ListNode(1);
            l3.next = last;
        }
        
        return dummy_head.next;
    }      
//         ListNode dummy_head = new ListNode();
//         ListNode l3 = dummy_head;
//         int carry = 0;
        
//         while (l1 != null || l2 != null) {
//             int l1_val = (l1 != null) ? l1.val : 0;
//             int l2_val = (l2 != null) ? l2.val : 0;
//             int sum = l1_val + l2_val + carry;
//             carry = sum / 10;
//             int last_digit = sum % 10;
            
//             ListNode nextNode = new ListNode(last_digit);
//             l3.next = nextNode;
            
//             if (l1 != null) l1 = l1.next;
//             if (l2 != null) l2 = l2.next;
//             l3 = l3.next;
//         }
        
//         if (carry > 0) {
//             ListNode lastNode = new ListNode(1);
//             l3.next = lastNode;
//         }
        
//         return dummy_head.next;
//     }

}