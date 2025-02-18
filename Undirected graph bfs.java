class Solution {
    
    private boolean checkIfCycle(boolean[] visited,int i,ArrayList<ArrayList<Integer>> adj){
        Queue<int[]> queue=new LinkedList<>();
        queue.offer(new int[]{i,-1});
        
        
        visited[i]=true;
        while(!queue.isEmpty()){
            int[]node =queue.poll();
            int child=node[0];
            int parent=node[1];
            
            for(int neighbour : adj.get(child)){
                if(neighbour==parent){
                    continue;
                }
                
                if(visited[neighbour]){
                    return true;
                }
                
                queue.offer(new int[]{neighbour,child});
                visited[neighbour]=true;
            }
            
        }
        return false;
    }
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
        int V=adj.size();
        
        boolean[] visited=new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i] && checkIfCycle(visited,i,adj)){
                return true;
            }
        }
        
        return false;
        // Code here
    }
}
