//think it as two appending nums 
//peeche se aage stack main dalo 
//i>=n h tb tk bs stack ko manage kro
//i<n pr vhi nge ka logic lgaao 

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];

        Stack<Integer> st=new Stack<>();

        for(int i=2*n-1;i>=0;i--){
            int in=i%n;
            if(i<n){
                while(!st.isEmpty()&& nums[in]>=st.peek() ){
                    st.pop();
                }
                if(st.isEmpty()){
                    ans[in]=-1;
                }else
                ans[in]=st.peek();
                st.push(nums[in]);


            }else{
                while(!st.isEmpty()&& nums[in]>=st.peek() ){
                    st.pop();
                }
                st.push(nums[in]);

            }
            
        }

        return ans;
        
    }
}
