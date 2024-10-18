class Solution {
    static Node constructLL(int arr[]) {
        
        Node head=new Node();
        head.data=arr[0];
        head.next=null;
        
        Node temp=head;
        
        for(int i=1;i<arr.length;i++){
            
            Node t=new Node();
            t.data=arr[i];
            t.next=null;
            temp.next=t;
            temp=temp.next;
            
        }
        return head;
        // code here
    }
}
