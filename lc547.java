class Solution {

    public void dfs(int[][] arr,boolean[] visited,int i,int n){
        // if(visited[i]){
        //     return;
        // }
        visited[i]=true;

        for(int j=0;j<n;j++){
            if(arr[i][j]==1 && !visited[j]){
                dfs(arr,visited,j,n);
            }
        }
    }
    public int findCircleNum(int[][] arr) {

        int n=arr.length;
        int count=0;
        boolean[] visited=new boolean[n];

        for(int i=0;i<n;i++){
            if(!visited[i]){
                count++;
                dfs(arr,visited,i,n);
            }
        }

        return count;
               
    }
}
