class Solution {
    public int findIn(StringBuilder st,String s){
        if(s.length()==0){
            return 0;
        }
        for(int i=0;i<Math.min(st.length(),s.length());i++){
            if(s.charAt(i)!=st.charAt(i)){
                return i;
            }
        }
        return Math.min(st.length(),s.length());
    }
    public String longestCommonPrefix(String[] strs) {

        if(strs.length==1){
            return strs[0];
        }
        int a=strs[0].length();
        int b=strs[1].length();
        StringBuilder st=new StringBuilder();

        for(int i=0;i<Math.min(a,b);i++){
            if(strs[0].charAt(i)==strs[1].charAt(i)){
                st.append(strs[0].charAt(i));
            }else{
                break;
            }

        }

        if(st.length()==0){
            return "";
        }

        for(int i=2;i<strs.length;i++){

            int j=findIn(st,strs[i]);

            st.delete(j,st.length());
            System.out.println(st);
            if(st.length()==0){
                return "";
            }

        }

        return st.toString();



        
    }
}
