class Solution {
    public ListNode oddEvenList(ListNode head) {
        if( head==null || head.next==null){
            return head;
        }
        ListNode odd=head;

        ListNode even=head.next;
        ListNode evenstart=head.next;

        while(even!=null &&  odd!=null && odd.next!=null && even.next!=null){
            odd.next=odd.next.next;
            odd=odd.next;
            even.next=even.next.next;
            even=even.next;

        }
        odd.next=evenstart;

        return head;

        
    }
}
