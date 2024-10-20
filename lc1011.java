class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int min=weights[0];
        int max=weights[0];


        for(int i=1;i<weights.length;i++){
            max+=weights[i];
            if(min<weights[i]){
                min=weights[i];
            }



        }

        int lb=min;
        int ub=max;
        int noD=0;

        while(lb<=ub){
            int mid=lb+(ub-lb)/2;
            int currW=0;
           // System.out.println(mid);
            noD=1;

            for(int i=0;i<weights.length;i++){
               
                
                if(currW+weights[i]>mid){
                    noD++;
                    currW=0;
                }
                    currW+=weights[i];

            }

            if(noD>days){
                lb=mid+1;

            }else{
                ub=mid-1;
            }



        }
        return lb;
        
    }
}
