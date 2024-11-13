lass Solution {
    public DLLNode reverseDLL(DLLNode head) {
        
        
        if(head.next==null){
            return head;
        }
        
        DLLNode temp=head;
        DLLNode temp2=head;
        while(temp!=null){
            temp2=temp.next;
            temp.next=temp.prev;
            temp.prev=temp2;
            head=temp.next;
            temp=temp.prev;
        }
        
        return head.prev;
    }
}
