class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int n=s.length();

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        List<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());

        list.sort((a,b)->b.getValue()-a.getValue());

        StringBuilder str=new StringBuilder();

        for(Map.Entry<Character,Integer> m: list){
            for(int i=0;i<m.getValue();i++){
                str.append(m.getKey());
            }
        }

        return str.toString();

        
    }
}
