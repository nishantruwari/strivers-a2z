/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode heada, ListNode headb) {
        int counta=0;
        int countb=0;

        ListNode tempa=heada;
        ListNode tempb=headb;

        while(tempa!=null){
            ++counta;
            tempa=tempa.next;
        }
        while(tempb!=null){
            ++countb;
            tempb=tempb.next;
        }

        tempa=heada;
        tempb=headb;
        int count=0;
        if(counta>countb){
            count=counta-countb;
            while(count-->0){
                tempa=tempa.next;

            }

        }else{
            count=countb-counta;

            while(count-->0){
                tempb=tempb.next;
            }

        }

        while(tempa!=null){
            if(tempa==tempb){
                return tempa;
            }

            tempa=tempa.next;
            tempb=tempb.next;
        }

        return null;

       
    }
}
