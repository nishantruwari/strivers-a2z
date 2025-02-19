class Solution{
    
    // Function to find number of bits needed to be flipped to convert A to B
    public static int countBitsFlip(int a, int b){
        
        int num=a^b;
        int count=0;
        while(num>0){
            if((num&1)==1){
                ++count;
            }
            num=num>>1;
        }
        
        return count;
        
        // Your code here
        
    }
    
    
}
