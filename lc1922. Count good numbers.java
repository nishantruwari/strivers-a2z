class Solution {
    private int MOD=1_000_000_007;
    public int countGoodNumbers(long n) {
        //think it as permutation combination problem
        //even pos - we can fill 0,2,4,6,8 --> 5 digits only
        // odd pos - we can fill only prime 2,3,5,7 --> 4 digits only 
        // now total combination= multiply both
        long even=(n+1)/2;
        long odd=n/2;
        long first=pow(5,even)%MOD;
        long second=pow(4,odd)%MOD;
        return (int)((first *second)%MOD);

        
    }

    private long pow(long x,long n){
        if(n==0) return 1;
        long temp=pow(x,n/2);

        if(n%2==0){
            return (temp*temp)%MOD;

        }else{
            return (x*temp*temp)%MOD;
        }
    }
}
