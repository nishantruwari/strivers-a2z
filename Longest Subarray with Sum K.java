class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        
        int prefixsum=0;
        int max=0;
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            prefixsum+=arr[i];
            
            if(prefixsum==k)  max=i+1;
            
            if(map.containsKey(prefixsum-k)){
                max=Math.max(max,i-map.get(prefixsum-k));
                
            }
            
            map.putIfAbsent(prefixsum,i);
            
        }
        
        return max;
    }
    
    
}
