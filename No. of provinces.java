//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int V = Integer.parseInt(read.readLine());
            
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            
            for(int i=0; i<V; i++)
            {
                String S[] = read.readLine().split(" ");
                ArrayList<Integer> temp = new ArrayList<>();
                for(int j=0; j<V; j++)
                    temp.add(Integer.parseInt(S[j]));
                adj.add(temp);
            }

            Solution ob = new Solution();
            System.out.println(ob.numProvinces(adj,V));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    private static void dfs(ArrayList<ArrayList<Integer>> adj,boolean[] visited,int i, int V){
        if(visited[i]){
            return;
        }
        
        visited[i]=true;
        
        for(int j=0;j<V;j++){
            if(adj.get(i).get(j)==1 && !visited[j]){
                
                dfs(adj,visited,j,V);
            }
        }
    }
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        boolean[] visited=new boolean[V];
        int count=0;
        
        for(int i=0;i<V;i++){
            if(!visited[i]){
                // visited[i]=true;
                ++count;
                dfs(adj,visited,i,V);
            }
        }
        
        return count;
        // code here
    }
};
