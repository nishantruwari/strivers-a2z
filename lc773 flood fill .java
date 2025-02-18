class Solution {
    public void dfs(int[][] image, int i, int j, int color,int m,int n,int currcolor){
        if(i<0 || j<0 || i>=m || j>=n ||image[i][j]!=currcolor || image[i][j]==color){
            return;

        }
        image[i][j]=color;
        dfs(image,i+1,j,color,m,n,currcolor);
        dfs(image,i,j+1,color,m,n,currcolor);
        dfs(image,i-1,j,color,m,n,currcolor);
        dfs(image,i,j-1,color,m,n,currcolor);
       
        return ;
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m=image.length;
        int n=image[0].length;
        int currcolor=image[sr][sc];
        dfs(image,sr,sc,color,m,n,currcolor);

        return image;
        
    }
}
