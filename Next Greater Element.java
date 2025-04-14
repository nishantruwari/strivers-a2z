class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        ArrayList<Integer> ans=new ArrayList<>();
        int n=arr.length;
        ans.add(-1);
        Stack<Integer> st=new Stack<>();
        st.push(arr[n-1]);
        
        for(int i=n-2;i>=0;i--){
            while(!st.isEmpty()&& arr[i]>=st.peek()){
                st.pop();
            }
            if(!st.isEmpty()){
                ans.add(st.peek());
            }else{
                ans.add(-1);
            }
            
            st.push(arr[i]);
            
        }
        Collections.reverse(ans);
        
        
        return ans;
        // code here
        
    }
}
