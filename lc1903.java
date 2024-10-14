class Solution {
    public int maxodd( String num){
        for(int i=num.length()-1;i>=0;i--){
            if((num.charAt(i)-'0')%2!=0){
                return i;
            }
        }
       
        return -1;
    }
    public String largestOddNumber(String num) {

        int i=maxodd( num);

        if(i==-1){
            return "";
        }else{
            return num.substring(0,i+1);
        }
        
    }
}
