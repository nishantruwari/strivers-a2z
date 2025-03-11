class Solution {
    public static int totalElements(Integer[] arr) {
        int n=arr.length;
        int l=0,r=0;
        
        int max=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        
        Set<Integer> set=new HashSet<>();
        
        
        
        while(r<n){
            map.put(arr[r],map.getOrDefault(arr[r],0)+1);
            set.add(arr[r]);
            
            while(l<=r && set.size()>2){
                map.put(arr[l],map.getOrDefault(arr[l],0)-1);
                if(map.get(arr[l])==0){
                    set.remove(arr[l]);
                }
                ++l;
            }
            max=Math.max(max,r-l+1);
            
            ++r;
        }
        
        return max;
        
        // code here
    }
}
