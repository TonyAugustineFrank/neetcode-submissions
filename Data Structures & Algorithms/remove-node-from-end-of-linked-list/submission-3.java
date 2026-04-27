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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current,fast,prev;
        fast = head;
        while(n>0)
        {
            fast = fast.next;
            n--;
        }
        current = head;
        prev=null;
        if(fast==null)
        {
            head = head.next;
            return head;
        }
        while(fast!=null)
        {
            fast = fast.next;
            prev=current;
            current = current.next;
        }
        prev.next=current.next;
        return head;
    }
}
