class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st=new Stack<>();

        int n=num.length();
        if(k==n) return "0";
        st.push(num.charAt(0));
        int count=0;

        for(int i=1;i<n;i++){
            while(!st.isEmpty()&& k>0&& (st.peek()-'0')>=(num.charAt(i)-'0')){
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
            
        }
        //think it as ascending order 12345 so we have to remove it from last
        if(k>0){
            st.pop();
            k--;
        }
        StringBuilder str=new StringBuilder();
        while(!st.isEmpty()){
            str.append(st.pop());

        }
        String ans=str.reverse().toString();
        int zero=0;

        for(int i=0;i<ans.length();i++){
            if(ans.charAt(i)-'0'!=0){
                break;
            }
            
                zero++;
           
        }
        if(zero==ans.length()) return "0";


        return ans.substring(zero,ans.length());
        
    }
}
