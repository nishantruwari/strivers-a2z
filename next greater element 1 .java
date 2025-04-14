/////using monotonic stack

class Solution {
    public int[] nextGreaterElement(int[] nums, int[] arr) {
        int n=nums.length;
        int m=arr.length;
        int[] ans=new int[n];

        
        
        int temp[]=new int[m];
        Stack<Integer> st=new Stack<>();
        st.push(arr[m-1]);
        temp[m-1]=-1;
        
        for(int i=m-2;i>=0;i--){
            while(!st.isEmpty()&& arr[i]>=st.peek()){
                st.pop();
            }
            if(!st.isEmpty()){
               temp[i]=st.peek();
            }else{
                temp[i]=-1;
            }
            
            st.push(arr[i]);
            
        }

        for(int i =0;i<n;i++){
            int target=nums[i];

            for(int j=0;j<m;j++){
                if(arr[j]==target){
                    ans[i]=temp[j];
                    break;
                }
            }
        }
        
        return ans;
        
        
        
    }
}
