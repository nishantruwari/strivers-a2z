class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int maxsum=0;
        for(int i:nums){
            maxsum+=i;
            if(maxsum>max){
                max=maxsum;
            }
            if(maxsum<=0){
                maxsum =0;
            }
            
        }

        return max;
        
    }
}
