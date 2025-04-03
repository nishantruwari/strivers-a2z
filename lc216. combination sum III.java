class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        generate(arr,ans,curr,0,0,k,n);
        return ans;
        
    }
    public void generate(int[] arr,List<List<Integer>> ans,List<Integer> curr,int i,int currsum,int limit,int target){
        if(curr.size()>limit) return;
        if(currsum>target)  return;
        if(i==arr.length) {
            if(curr.size()==limit && currsum==target){
                ans.add(new ArrayList<>(curr));
            }

            return;
        }

        curr.add(arr[i]);
        generate(arr,ans,curr,i+1,currsum+arr[i],limit,target);
        curr.remove(curr.size()-1);
        generate(arr,ans,curr,i+1,currsum,limit,target);




    }
}
