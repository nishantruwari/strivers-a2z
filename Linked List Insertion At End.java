class Solution {
    // Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
        // code here
        if(head==null){
            Node t=new Node(x);
            return t;
            
        }
        
        Node temp=head;
        
        while(temp.next!=null){
            temp=temp.next;
            
        }
        
        Node t=new Node(x);
       
        temp.next=t;
        
        return head;
    }
}
