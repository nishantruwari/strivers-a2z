class Solution {
    public void sortColors(int[] nums) {
        //single pass approach
        int low=0,mid=0,high=nums.length-1;

        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low,mid);
                mid++;
                low++;
            }else if(nums[mid]== 1){
                mid++;
            }else{
                swap(nums,mid,high);
               // mid++;
                high--;
            }
        }       
        
    }

    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
