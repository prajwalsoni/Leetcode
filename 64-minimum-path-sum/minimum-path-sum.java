
class Solution {
    public int minPathSum(int[][] grid) {
     /*
int m=grid.length;
int n=grid[0].length;
return f(m-1,n-1,grid);
    }
    public static int f(int i,int j,int mat[][]){
        if((i==-1)||(j==-1))
        return Integer.MAX_VALUE;
        else if((i==0)&&(j==0))
        return mat[0][0];
        else{
        int t1=f(i-1,j,mat);
        int t2=f(i,j-1,mat);
        return Math.min(t1,t2)+mat[i][j] ;
        } */
        
       int m=grid.length;
int n=grid[0].length;
int dp[][]=new int[m+1][n+1];
for(int i=0;i<=m;i++){
    for(int j=0;j<=n;j++){
        dp[i][j]=-1;
    }
}
return f(m-1,n-1,grid,dp);
    }
    public static int f(int i,int j,int mat[][],int dp[][]){
  if((i==-1)||(j==-1))
        return Integer.MAX_VALUE;

        else if(dp[i][j]!=-1)
        return dp[i][j];
       
        else if((i==0)&&(j==0))
        dp[i][j]= mat[0][0];
        else{
        int t1=f(i-1,j,mat,dp);
        int t2=f(i,j-1,mat,dp);
        dp[i][j]= Math.min(t1,t2)+mat[i][j];
        }
return dp[i][j];





}
}
