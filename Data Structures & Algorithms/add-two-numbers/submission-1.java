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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null&&l2==null){
            return null;
        }
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        int sum = l1.val + l2.val;
        int carry = sum/10;
        sum %=10;
        
        ListNode result = new ListNode(sum);
        ListNode resultRef = result;
        ListNode currentL1 = l1;
        ListNode currentL2 = l2;

        while(currentL1.next!=null&&currentL2.next!=null){
            ListNode temp1 = currentL1.next; 
            ListNode temp2 = currentL2.next;

            int v1 = temp1.val;
            int v2 = temp2.val;

            sum = carry + v1 +v2;
            carry = sum/10;
            sum %=10;

            ListNode temp3 = new ListNode(sum);
            result.next = temp3;
            result = result.next;
            currentL1 = currentL1.next;
            currentL2 = currentL2.next;
        }

        while(currentL1.next!=null){
            ListNode temp1 = currentL1.next; 
            int v1 = temp1.val;
            sum = carry + v1;
            carry = sum/10;
            sum %=10;
            ListNode temp3 = new ListNode(sum);
            result.next = temp3;
            result = result.next;
            currentL1 = currentL1.next;
        }
        while(currentL2.next!=null){
            ListNode temp2 = currentL2.next; 
            int v2 = temp2.val;
            sum = carry + v2;
            carry = sum/10;
            sum %=10;
            ListNode temp3 = new ListNode(sum);
            result.next = temp3;
            result = result.next;
            currentL2 = currentL2.next;
        }
        if(carry!=0){
            result.next = new ListNode(carry);
        }



        return resultRef;  
    }
}
