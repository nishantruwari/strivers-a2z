public class Solution {
    public int[] prevSmaller(int[] A) {
        
        Stack<Integer> st=new Stack<>();
        int n=A.length;
        int[] ans=new int[n];
        if(n==0) return ans;
        st.push(A[0]);
        ans[0]=-1;
        
        for(int i=1;i<n;i++){
            while(!st.isEmpty() && A[i]<=st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=-1;
            }else
                ans[i]=st.peek();
                
            st.push(A[i]);
        }
        
        return ans;
    }
}
