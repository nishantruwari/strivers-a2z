class Solution {
    public int missingNumber(int[] nums) {
        int[] mark=new int[nums.length+1];
        for(int i:nums){
            mark[i]=1;
        }

        for(int i=0;i<mark.length;i++){
            if(mark[i]==0){
                return i;
            }
        }
        return -1;

    }
}
