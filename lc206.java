class Solution {
    public ListNode reverseList(ListNode head) {

        if(head==null || head.next==null){
            return head;
        }
        //2 nodes
        if(head.next.next==null){
            ListNode temp=head;
            ListNode temp2=head.next;
            temp.next=null;
            temp2.next=temp;
            return temp2;
        }


        //3 nodes or more
        ListNode t1=null;
        ListNode t2=head;
        ListNode t3=head.next;

        while(t3.next!=null){
            t2.next=t1;
            t1=t2;
            t2=t3;
            t3=t3.next;
            t2.next=t1;
        }
        t3.next=t2;

        return t3;

        
        
    }
}
