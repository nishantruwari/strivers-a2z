/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        int count=0;

        ListNode temp=head;

        while(temp!=null){
            ++count;
            temp=temp.next;
        }

        if(count==1){
            return null;
        }

        if(count==2){
            head.next=null;
            return head;
        }
        int n=count/2;
        int curr=0;
        temp=head;

        while(temp!=null){
            if(curr==n-1){
                temp.next=temp.next.next;
                return head;
            }
            temp=temp.next;
            ++curr;

        }
        return temp;
        
    }
}
