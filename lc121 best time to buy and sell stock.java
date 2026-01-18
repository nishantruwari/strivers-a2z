class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int ans=0;
        for(int i : prices){
            if(i<minPrice){
                minPrice=i;
            }

            ans=Math.max(ans,i-minPrice);
        }

        return ans;
        
    }
}
