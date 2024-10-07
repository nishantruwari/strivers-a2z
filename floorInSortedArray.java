//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Searching {
    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String a[] = read.readLine().trim().split("\\s+");
            int n = Integer.parseInt(a[0]);
            long x = Long.parseLong(a[(int)1]);
            String st[] = read.readLine().trim().split("\\s+");

            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(st[i]);
            }

            out.println(new Solution().findFloor(arr, n, x));
        }
        out.close();
    }
}
// } Driver Code Ends


class Solution {

    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x) {
        int lb=0;
        int ub=n-1;
        if(arr[0]>x){
            return -1;
            
        }
        
        if(arr[0]==x){
            return 0;
        }
        
        if(arr[n-1]<=x){
            return n-1;
        }
        int temp=-1;
        int mid;
         while(lb<ub){
             mid=lb+(ub-lb)/2;
             if(arr[mid]==x){
                 return mid;
             }else{
                 if(arr[mid]<x){
                     temp=mid;
                     lb=mid+1;
                 }else{
                     ub=mid;
                 }
             }
         }
         
         return temp;
    }
}