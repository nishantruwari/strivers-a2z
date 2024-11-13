class Solution {
    public ListNode reverseList(ListNode head) {

        if(head==null || head.next==null){
            return head;
        }

        ListNode newhead=reverseList(head.next);
        ListNode headnext=head.next;
        headnext.next=head;
        head.next=null;
        return newhead;
        
    }
}
