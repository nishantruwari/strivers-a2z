class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        
        Set<Integer> set=new HashSet<>();
        
        for(int i: a){
            set.add(i);
        }
        for(int i:b){
            set.add(i);
        }
        
        ArrayList<Integer> arr=new ArrayList<>();
        
        for(int i: set){
            arr.add(i);
            
        }
        
        Collections.sort(arr);
        
        return arr;
    }
}
