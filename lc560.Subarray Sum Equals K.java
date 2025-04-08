class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        int prefixsum=0,count=0;
        for(int i=0;i<n;i++){
            prefixsum+=nums[i];

            if(prefixsum==k){
                ++count;

            } 
            if(map.containsKey(prefixsum-k)){
                count+=map.get(prefixsum-k);
            }


            map.put(prefixsum,map.getOrDefault(prefixsum,0)+1);

        }

        return count;
        
    }
}
