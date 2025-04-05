//prefix to infix 
//1.reverse krdo
//2.push kro char ko 
//3.operands aaye toh pop kro do do k pair m for binary operands
//4.push kro operands beech m lga kr

class Solution {
    static String preToInfix(String p) {
        StringBuilder str=new StringBuilder(p);
        Stack<String> st=new Stack<>();
        str.reverse();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isLetterOrDigit(c)){
                st.push(String.valueOf(c));
            }else{
                
                if(st.isEmpty()){
                    return "Invalid String";
                }
                String s1=new String("("+st.pop());
                String s2=new String(st.pop());
                s1+=c;
                s1+=s2;
                s1+=")";
                st.push(s1);
            }
            
            
            
        }
        return st.pop();
        
        // code here
    }
}
