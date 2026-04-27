class Solution {

    public void reorderList(ListNode head) {

        Map<Integer,ListNode> map = new HashMap<>();

        int i=0;

        while(head!=null)

        {

            map.put(i++,head);

            head = head.next;

        }

        int l,r;

        l = 0;

        r = map.size()-1;

        ListNode temp=null;

        i=0;

        while(i<map.size())

        {

            if(i%2==0)

            {

                temp = map.get(l++);

                temp.next = map.get(r);

            }

            else{

                temp = map.get(r--);

                temp.next = map.get(l);

            }
            

            i++;

        }
        if(temp!=null)
                temp.next = null;

        head = map.get(0);

    }

}