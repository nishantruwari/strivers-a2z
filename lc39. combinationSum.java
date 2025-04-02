
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<Integer>();
        generate(ans,curr,target,candidates,0,0);

        return ans;
    }

    public static void generate(List<List<Integer>> ans,List<Integer> curr,int target,int[] candidates,int i,int currsum){

       if(currsum==target){
                ans.add(new ArrayList<>(curr));
                return;
            }

        if(i==candidates.length || currsum>target){
            
            return;

        }
        
        //reinclude same
        curr.add(candidates[i]);
        generate(ans,curr,target,candidates,i,currsum+candidates[i]);
        curr.remove(curr.size()-1);


        


        
        generate(ans,curr,target,candidates,i+1,currsum);
        
    }
}
