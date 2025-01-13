class Solution {
    public int myAtoi(String st) {
        
       
        String s=st.trim();
         int n=s.length();
         if(n==0) return 0;
        boolean isNeg=false;
        if(s.charAt(0)=='-') isNeg=true;
        int i=isNeg==true||s.charAt(0)=='+'?1:0;
        long ans=0;

        for(;i<n;++i){
            if(s.charAt(i)-'0'<0 || s.charAt(i)-'0'>9){

                ans=isNeg==true?-1*ans:ans;
                return (int)ans;
            }
            ans=ans*10+s.charAt(i)-'0';
            if(isNeg==true&&ans>Integer.MAX_VALUE){
                return Integer.MIN_VALUE;
            }
            if(isNeg==false && ans>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }

        }
        ans=isNeg==true?-1*ans:ans;

        return (int)ans;


        
    }
}
