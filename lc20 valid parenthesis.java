class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack();
        int n=s.length();

        for(int i =0;i<n;i++){
            char c=s.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                st.push(c);
                continue;
                
            }

            if(c==')'){
                if(!st.isEmpty() && st.pop()=='('){

                }else{
                    return false;
                }

            }
            if(c=='}'){
                if(!st.isEmpty() && st.pop()=='{'){

                }else{
                    return false;
                }
                
            }
            if(c==']'){
                if(!st.isEmpty() && st.pop()=='['){

                }else{
                    return false;
                }
                
            }

        }

        if(st.isEmpty()) return true;
        return false;
        
    }
}
