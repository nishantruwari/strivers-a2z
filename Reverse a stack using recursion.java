class Solution
{ 
    static void reverse(Stack<Integer> s)
    {
        if(s.isEmpty()){
            return ;
        }
        
        int top =s.pop();
        reverse(s);
        pushAtBottom(s,top);
    }
    static void pushAtBottom(Stack<Integer> s,int element){
        if(s.isEmpty()){
            s.push(element);
        }else{
            int top=s.pop();
            pushAtBottom(s,element);
            s.push(top);
        }
    }
}
