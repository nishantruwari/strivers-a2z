class Solution {
    static String postToPre(String p) {
        // code here
                StringBuilder str=new StringBuilder(p);
        Stack<String> st=new Stack<>();
       // str.reverse();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isLetterOrDigit(c)){
                st.push(String.valueOf(c));
            }else{
                
                if(st.isEmpty()){
                    return "Invalid String";
                }
                String s1=new String(st.pop());
                String s2=new String(st.pop());
                s2=c+s2;
                s2+=s1;
                //s1+=")";
                st.push(s2);
            }
            
            
            
        }
        return st.pop();
    }
}
