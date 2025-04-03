class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character,String> map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        int n=digits.length();
        
        List<String> ans=new ArrayList<>();
        if(n<=0) return ans;

       


        generate(map,ans,digits,n,"",0);

        return ans;
        
    }
    public void generate(HashMap<Character,String> map,List<String> ans,String digits,int n,String s,int idx){
        if(s.length()==n){
            ans.add(s);

            return;
        }
        char cur=digits.charAt(idx);
        String str=map.get(cur);

        for(int i=0;i<str.length();i++){
            generate(map,ans,digits,n,s+str.charAt(i),idx+1);
           
            
            
        }
        
    }
}
