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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0){
            return null;
        }
        ListNode result=new ListNode(0);
        ListNode head = result;

        Queue<ListNode> pq = new PriorityQueue<>(Comparator.comparingInt(lNode -> lNode.val));
        for(ListNode lNode : lists){
            if(lNode!=null)
                pq.add(lNode);
        }
        while(!pq.isEmpty()){
            result.next = pq.poll();
            ListNode temp = result.next;
            temp = temp.next;
            if(temp!=null)
                pq.add(temp);
            
            result = result.next;
        }
        return head.next;
    }
}
