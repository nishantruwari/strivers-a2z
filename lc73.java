class Solution {
    public void setZeroes(int[][] arr) {
        Set<Integer> row=new HashSet<>();
        Set<Integer> col=new HashSet<>();

       int n=arr.length;
       int m=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                if(arr[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
                


            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row.contains(i)||col.contains(j)){
                    arr[i][j]=0;
                }

            }
        }


    }
}
