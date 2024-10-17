class Solution
{
    public int NthRoot(int n, int m)
    {
        // code here
        
        int high=m;
        int low=1;
        
        while(low<=high){
            int mid= low+(high-low)/2;
            int x=(int)Math.pow(mid,n);
            
            if(x==m){
                return mid;
            }
            
            if(x>m){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
        
        
    }
}
