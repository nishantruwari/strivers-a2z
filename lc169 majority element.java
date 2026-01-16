class Solution {
    public int majorityElement(int[] nums) {
        //Boyer -Moore theorem
        int count=0;
        int candidate =-1;
        for(int num : nums){
            if(count == 0){
                candidate = num;
                //count++;
            }
            count += (candidate == num)? 1:-1;
            
        }

        return candidate;
        
    }
}
