class Solution


{
    boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
        
    }
    public int[] AllPrimeFactors(int N)
    {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        
        
        for(int i=2;i<=N;i++){
            if(N%i==0&&isPrime(i)){
                ans.add(i);
                
            }
            
        }
        int n=ans.size();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ans.get(i);
        }
        
        return arr;
    }
}
