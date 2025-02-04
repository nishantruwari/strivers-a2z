class Solution {
    static int xor(int n){
        if(n%4==0) return n;
        if(n%4==1) return 1;
        if(n%4==2) return n+1;
        if(n%4==3)   return 0;
        return -1;
    }
    public static int findXOR(int l, int r) {
        
        return xor(l-1)^xor(r);
        
    }
}
