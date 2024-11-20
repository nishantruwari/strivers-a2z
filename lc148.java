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
    public ListNode sortList(ListNode head) {

        //can be done by array and then Arrays.sort(arr);
        //can be done by arraylist and then collection.sort(arr);

       // List<Integer> list=new ArrayList<>();
       PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->a-b);

        ListNode temp=head;

        while(temp!=null){
            pq.add(temp.val);
            temp=temp.next;
        }

        temp=head;

        while(temp!=null){
            temp.val=pq.poll();
            temp=temp.next;
        }
        return head;
        
    }
}
