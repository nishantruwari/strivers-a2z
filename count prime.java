class Solution {
    public int countPrimes(int n) {
        boolean[] isPrime=new boolean[n];
        if(n<2) return 0;

        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;

        

        for(int i=2;i<Math.sqrt(n);i++){
            if(isPrime[i]){
                for(int j=i*i;j<n;j+=i){
                    isPrime[j]=false;
                }
            }

        }
        int count=0;

        for(boolean prime : isPrime){
            if(prime) ++count;
        }

        return count;
        
    }
}
