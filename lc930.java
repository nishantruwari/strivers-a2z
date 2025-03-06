class Solution {
    //2pointer approach
    //calculates number of subarrays with sum less than or equal to goal
    private static int helper(int[] nums,int goal){
        if(goal<0){
            return 0;
        }
        int l=0,r=0,count=0,sum=0;
        int n=nums.length;

        while(r<n){
            sum+=nums[r];
            while(sum>goal){
                sum-=nums[l];
                ++l;
            }

            count+=r-l+1;
            ++r;


        }

        return count;

    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return helper(nums,goal)-helper(nums,goal-1);
    }
}
