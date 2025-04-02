class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
       List<List<Integer>> ans =new ArrayList<>();
       List<Integer> curr=new ArrayList<>();
       Arrays.sort(candidates);
       //Set<List<Integer> > set=new HashSet<>();

       generate(ans,curr,0,0,target,candidates);
       return ans; 
    }
    public static void generate(List<List<Integer>> ans,List<Integer> curr,int i, int currsum,int target,int[] candidates){
        if(currsum==target){
           
              
            ans.add(new ArrayList<Integer>(curr));

           
            
            return;
        }

        if(i>=candidates.length || currsum>target){
            return;
        }
        int n=candidates.length;

        for(int idx=i;idx<n;idx++){
            if(idx>i&& candidates[idx]==candidates[idx-1]){
                continue;
            }
            curr.add(candidates[idx]);
            generate(ans,curr,idx+1,currsum+candidates[idx],target,candidates);
            curr.remove(curr.size()-1);
        }

        
        
       // generate(ans,curr,i+1,currsum,target,candidates,set);





    }
}
