//note -- do these questions by atmost trick

class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atmostSub(nums,k)-atmostSub(nums,k-1);
        
        
    }

    public int atmostSub(int[] nums,int k){
        int n=nums.length;
        int r=0,l=0;
        int count=0;
        int ans=0;

        while(r<n){
            if(nums[r]%2==1){
                ++count;
            }

            while(l<r && count>k){
                if(nums[l]%2==1){
                    --count;
                }
                ++l;
            }

            if(count<=k){
                ans+=(r-l+1);

            }
            ++r;

        }

        return ans;
    }
}
