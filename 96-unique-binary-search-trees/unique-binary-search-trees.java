class Solution {
    public int numTrees(int n) {
        int[] dp=new int[n+1];
        //return help(n,dp);
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=0;j<i;j++){
                dp[i]+=dp[j]*dp[i-j-1];
            }
        }
        return dp[n];
    }
    /*int help(int n,int[] dp){
        if(n==0) return 1;
        if(n==1) return 1;
        if(dp[n]==0){
        int s=0;
        for(int i=0;i<n;i++){
        s+=help(i,dp)*help(n-i-1,dp);
        }
        dp[n]=s;
        }
        return dp[n];
    }*/
}