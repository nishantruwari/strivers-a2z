class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        int count=0;

        while(temp!=null){
            ++count;
            temp=temp.next;
        }
        temp=head;
        int n=count/2;
        Stack<Integer> stack=new Stack<>();


        while(n-->0){
            stack.push(temp.val);
            temp=temp.next;

        }
        if(count%2!=0){
            temp=temp.next;
        }

        while(temp!=null){
            if(stack.pop()!=temp.val){
                return false;

            }
            temp=temp.next;
        }

        return true;
        
    }
}
