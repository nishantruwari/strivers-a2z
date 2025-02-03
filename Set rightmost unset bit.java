class Solution {
    static int getindex(int a){
        int temp=a;
        int k =0;
        for(int i=0;i<32;i++){
            if((temp&1)==0)
                 return k;
            temp=temp>>1;
            ++k;
        }
        return -1;
        
    }
    static int setBit(int n) {
        
        int k =getindex(n);
        
        return (n|(1<<k));
        
        
        // code here
    }
}
