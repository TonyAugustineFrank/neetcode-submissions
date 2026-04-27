/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)
            return head;

        Node currentNew = new Node(head.val);
        Node newHead = currentNew;

        Map<Node,Node> nodes = new HashMap<>();

        nodes.put(head,currentNew);

        Node currentOld = head;

        while(currentOld.next!=null){
            currentNew.next = new Node(currentOld.next.val);
            currentOld = currentOld.next;
            currentNew = currentNew.next;
            nodes.put(currentOld,currentNew);
        }


        currentOld = head;
        currentNew = newHead;

        while(currentOld!=null&&currentNew!=null){
            Node oldRandom = currentOld.random;
            currentNew.random = nodes.get(oldRandom);
            
            currentOld = currentOld.next;
            currentNew = currentNew.next;
        }


        return newHead;
        
    }
}
