class Solution {


    public boolean  possible(int[] bloomDay, int m, int k,int i){

        int count=0;
        int noOfB=0;

        for(int j=0;j<bloomDay.length;j++){
            if(bloomDay[j]<=i){
                count++;


            }else{
                noOfB+=count/k;
                count=0;

            }


        }
         noOfB+=count/k;

         if(noOfB>=m){
            return true;
         }else{
            return false;
         }
    }
    public int minDays(int[] bloomDay, int m, int k) {

        if(m*k>bloomDay.length){
            return -1;
        }

        int min= bloomDay[0];
        int max=bloomDay[0];
        

        for(int i: bloomDay){
            if(i<min){
                min=i;
            }

            if(max<i){
                max=i;
            }
        }

        //
        int lb=min;
        int ub= max;

        int minans=Integer.MAX_VALUE;

        while(lb<=ub){
            int mid=lb+(ub-lb)/2;
            if(possible( bloomDay, m,  k, mid)==true){
                if(minans>mid){
                    minans=mid;
                }

                ub=mid-1;

            }else{

                lb=mid+1;

            }

        }

        return minans==Integer.MAX_VALUE?-1:minans;
        //

        // for(int i=min;i<=max;i++){
        //     if(possible( bloomDay, m,  k, i)==true){
        //         return i;
        //     }

        // }
        // return -1;



        
    }
}
