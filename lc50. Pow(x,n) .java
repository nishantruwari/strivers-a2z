class Solution {
    public double myPow(double x, int n) {
        if(n>=0){
            return pow(x,n);

        }else{
            n=n*-1;
            return 1.000/pow(x,n);
        }
        
        
    }
    private double pow(double x, int n){
        if(n==0) return 1.000;
        double temp=pow(x,n/2);

        if(n%2==0){
            return temp*temp;
        }else{
            return x*temp*temp;
        }
    }
}
