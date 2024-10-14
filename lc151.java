class Solution {
    public String reverseWords(String s) {
        String[] str=s.split("\\s+");
        String ans="";
        //System.out.println(str.length);
        for(int i=str.length-1;i>0;i--){
          //  System.out.println(str[i]);
          //  if(str[i]!=" ")
            ans+=str[i]+" ";
        }
        ans+=str[0];
        return ans.trim();
        
    }
}
