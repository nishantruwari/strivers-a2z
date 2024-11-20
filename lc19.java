class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int count=0;
        ListNode temp=head;

        while(temp!=null){
            ++count;
            temp=temp.next;
        }
        temp=head;

        if(count==1){
            head=null;
            return head;
        }

        if(n>count){
            return null;
        }

        if(count==n ){
           // temp=head;
            temp=head.next;
            return temp;
        }
        for(int i=1;i<count-n;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
        
    }
}
