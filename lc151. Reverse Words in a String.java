class Solution {
    public String reverseWords(String s) {
        s.trim();
        String[] str=s.split("\\s+");
        StringBuilder ans=new StringBuilder();
        int n=str.length;
        for(int i=n-1;i>=1;i--){
            ans.append(str[i]);
            ans.append(" ");
        }
        ans.append(str[0]);
        

        return ans.toString().trim();


        
    }
}
