class Solution {
    public int minBitFlips(int start, int goal) {
        int xor=start^goal;
        int count =0;
        //count the one in xor because xor will result to 1 if bits were diff that means those were the ones which needed to flipped 
        while(xor>1){
            if((xor&1)==1) ++count;

            xor=xor>>1;
        }
        if(xor==1) ++count;

        return count;
        
    }
}
