class Solution {
    static void bitManipulation(int n, int i) {
        
       System.out.print(((n>>(i-1))&1)+" "+(n|(1<<(i-1)))+" "+(n&(~(1<<(i-1)))));
        // code here
    }
}
