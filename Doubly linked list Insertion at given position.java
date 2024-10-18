class Solution {
    // Function to insert a new node at given position in doubly linked list.
    Node addNode(Node head, int p, int x) {
        
        Node temp=head;
        int count =0;
        
        // at beginning p=0
        
        if(p==0){
            Node t=new Node(x);
            //t.data=x;
            t.prev=null;
            t.next=temp;
            head=t;
            return head;
        }
        
        while(temp!=null){
            
            if(count==p){
                if(temp.next!=null){  //not last
                
                    Node t=new Node(x);
                   // t.data=x;
                    t.prev=temp;
                    t.next=temp.next;
                    temp.next=t;
                    t.next.prev=t;
                    return head;
                    
                }else{
                    Node t=new Node(x);
                   // t.data=x;
                    t.prev=temp;
                    temp.next=t;
                    t.next=null;
                    return head;
                }
            }
            temp=temp.next;
            ++count;
            
        }
        return head;
        
        
        
        // Your code here
    }
}
