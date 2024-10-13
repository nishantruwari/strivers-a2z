//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input1 = sc.nextLine();
            Scanner ss1 = new Scanner(input1);
            while (ss1.hasNextInt()) {
                arr.add(ss1.nextInt());
            }
            Solution ob = new Solution();
            int res = ob.findKRotation(arr);
            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int findKRotation(List<Integer> nums) {
         int low=0;
        int high=nums.size()-1;
        if(nums.get(low)<nums.get(high)){
            return low;
        }

        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid==0){
                if(nums.get(mid)<nums.get(high)){
                    return mid;
                }else{
                    return high;
                }
            }
            // if(mid==nums.length-1){
            //     return nums[mid];
            // }
            if(nums.get(mid)<nums.get(mid-1)&&nums.get(mid)<nums.get(mid+1)){
                return mid;
            }
            if(nums.get(mid)>nums.get(mid-1)&&nums.get(mid)>nums.get(mid+1)){
                return mid+1;
            }
            if(nums.get(mid)>nums.get(mid-1)&&nums.get(mid)<nums.get(mid+1)){
                if(nums.get(mid)>nums.get(low)){
                    low=mid+1;

                }else{
                    high=mid-1;
                }
                
            }


        }
        return -1;
        
        
        // Code here
    }
}




       
        
    
