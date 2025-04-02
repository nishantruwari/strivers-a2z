class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        //include not include
        int n=nums.length;
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        generate(ans,curr,0,n,nums);

        return ans;

        
    }

    private void generate(List<List<Integer>> ans,List<Integer> curr, int i,int n,int[] nums ){
        if(i==n){
            ans.add(new ArrayList<>(curr));
            return;
        }
        generate(ans,curr,i+1,n,nums);

        curr.add(nums[i]);
        generate(ans,curr,i+1,n,nums);
        curr.remove(curr.size()-1);


    }
}
