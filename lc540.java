class Solution {
    public int singleNonDuplicate(int[] nums) {

        if(nums.length==1){
            return nums[0];
        }

        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            if(low==high){
                return nums[low];
            }
            int mid = low + (high - low) / 2;
            if (mid == 0) {
                if (nums[mid] != nums[mid + 1]) {
                    return nums[mid];
                } else {
                    return nums[high];
                }
            }

            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }

            if ((mid + 1) % 2 != 0) {
                if (nums[mid] == nums[mid + 1]) {
                    low = mid+1;
                } else {
                    high = mid-1;
                }

            }else{
                if (nums[mid] == nums[mid + 1]) {
                    high = mid-1;
                } else {
                    low = mid+1;
                }

            }

        }
        return -1;

    }
}
