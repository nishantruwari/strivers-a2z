//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class GfG {
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data);
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int n = str.length;
            Node head = new Node(Integer.parseInt(str[0]));
            Node tail = head;
            for (int i = 1; i < n; i++) {
                tail.next = new Node(Integer.parseInt(str[i]));
                tail = tail.next;
            }
            Solution obj = new Solution();
            head = obj.addOne(head);
            printList(head);
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    
    public Node rev(Node head){
        if(head==null || head.next==null) return head;
        
        Node revhead=rev(head.next);
        head.next.next=head;
        head.next=null;
        return revhead;
    }
    public Node addOne(Node head) {
        
        Node newhead=rev(head);
        
        Node temp=newhead;
        if(temp.data<9){
            temp.data+=1;
            return rev(newhead);
        }
        
        if(temp.data==9){
           // temp.data=0;
            int carry=1;
            while(carry==1 && temp!=null){
                carry=(temp.data+1)/10;
                temp.data=(temp.data+1)%10;
                temp=temp.next;
                
            }
            
            if(temp!=null){
                return rev(newhead);
            }else{
                Node l=new Node(1);
                l.next=rev(newhead);
                return l;
            }
        }
        
        return newhead;
        // code here.
    }
}
