class Solution {
    public double myPow(double x, int n) {

        double ans=1;
        if(n==Integer.MIN_VALUE) return x>1?0:1;
        if(n<0){
            x=1/x;
            n=-1*n;

        } 

        while(n>0){
            if(n%2==1){
                ans=ans*x;
                n=n-1;

            }else{
                n=n>>1;
                x=x*x;
            }
        }

        return ans;
        
    }
}
