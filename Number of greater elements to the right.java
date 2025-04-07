class Solution {
  public static int[] count_NGEs(int N, int arr[], int queries, int indices[]) {
    // code here
    
    int[] ans=new int[queries];
    
    for(int i=0;i<indices.length;i++){
        int count=0;
        int target=arr[indices[i]];
        for(int j=indices[i]+1;j<N;j++){
            if(arr[j]>target){
                ++count;
            }
        }
        
        ans[i]=count;
    }
    
    return ans;
     
  }
}
