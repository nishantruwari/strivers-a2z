class Solution{
    static int pageFaults(int N, int C, int pages[]){
        // code here
        Queue<Integer> q=new LinkedList<>();
        int faults=0;
        
        for(int i=0;i<N;i++){
            int p=pages[i];
            if(!q.contains(p)){
                ++faults;
                if(q.size()>=C){
                    q.remove();
                    
                }
                q.offer(p);
            }else{
                
                
                q.remove(p);
                q.offer(p);
            }
        }
        
        return faults;
    }
