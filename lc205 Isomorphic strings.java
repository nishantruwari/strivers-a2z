
class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n=s.length();
        
        HashMap<Character,Character> mapSt=new HashMap<>();
        HashMap<Character,Character> mapTs=new HashMap<>();

        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            char d=t.charAt(i);
           if(mapSt.containsKey(c)){
                if(mapTs.containsKey(d)){
                    if(mapSt.get(c)!= d &&mapTs.get(d)!=c){
                        return false;
                    }
                }else{
                    return false;
                }

           }else{
                if(mapTs.containsKey(d)){
                    return false;
                }else{
                    mapSt.put(c,d);
                    mapTs.put(d,c);
                }

           }
            
        }
        return true;
        
    }
}
