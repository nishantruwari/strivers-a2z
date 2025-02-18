class Solution {
    
    private boolean checkIfCycle(boolean[] visited,int i,int parent,ArrayList<ArrayList<Integer>> adj){
       visited[i]=true;
       for(int neighbour :adj.get(i)){
           if(neighbour==parent) continue;
           if(visited[neighbour]) return true;
           
           //visited[neighbour]=true;
           if(checkIfCycle(visited,neighbour,i,adj)){
               return true;
           } 
       }
        return false;
    }
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
        int V=adj.size();
        
        boolean[] visited=new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i] && checkIfCycle(visited,i,-1,adj)){
                return true;
            }
        }
        
        return false;
        // Code here
    }
}
