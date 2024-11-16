class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        
        int count=1;
        Node s=head;
        Node f=head;
        
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            
            if(s==f){
                s=s.next;
                f=f.next;
                if(s==f){
                    s=s.next;
                    while(s!=f){
                        s=s.next;
                    ++count;
                        
                    }
                    
                    return count;
                    
                }
            }
            
        }
        
        return 0;
        // Add your code here.
    }
}
