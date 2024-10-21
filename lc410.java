class Solution {
    public int cal(int[] nums,int lim){
        int curr=0;
        int par=1;
        for(int i=0;i<nums.length;i++){
            if(curr+nums[i]<=lim){
                curr+=nums[i];
            }else{
                ++par;
                curr=nums[i];
            }

        }

        return par;
    }
    public int splitArray(int[] nums, int k) {

        int n=nums.length;
        if(k>n){
            return -1;
        }


        int sum=0;
        int max=0;

        for(int i:nums){
            max=Math.max(i,max);
            sum+=i;
        }

        int lb=max;
        int ub=sum;
        int res=-1;
        while(lb<=ub){
            int mid=lb+(ub-lb)/2;
            int par=cal(nums,mid);

            if(par<=k){
                ub=mid-1;
                res=mid;

            }else{
                lb=mid+1;
            }




        }

        return res;
        
    }
}
