class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int max=0;
        int lsum=0,rsum=0;
        int n=cardPoints.length;

        for(int i=0;i<k;i++){
            lsum+=cardPoints[i];
        }
        max=lsum;

        if(n==k)  return lsum;

        for(int i=k-1,j=n-1;i>=0;i--,j--){
            lsum-=cardPoints[i];
            lsum+=cardPoints[j];
            max=Math.max(max,lsum);


        }

        return max;
        
    }
}
