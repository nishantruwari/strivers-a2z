import java.util.ArrayList;
public class Solution {

    public static int cal(ArrayList<Integer> arr, int limit){

        int curr=0;
        int student=1;
        for(int i=0;i<arr.size();i++){
            if(curr+arr.get(i)<=limit){
                curr+=arr.get(i);
            }else{
                ++student;
                curr=arr.get(i);
            }
           
        } return student;

    }
    public static int findPages(ArrayList<Integer> arr, int n, int m) {

            if(m>n){
                return -1;
            }
        
         int max=0;
         int sum=0;
         for(int i=0;i<arr.size();i++){
             max=Math.max(arr.get(i),max);
             sum+=arr.get(i);
         }

         int lb=max;
         int ub=sum;
         int res=-1;

         while(lb<=ub){
             int mid=lb+(ub-lb)/2;
             int student=cal(arr,mid);

            //  if(student==m){
            //      return lb;
            //  }
             if(student<=m){
                 res=mid;
                 ub=mid-1;
             }else{
                 lb=mid+1;
             }
         }

         return res;
    }
}
