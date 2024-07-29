package DP_Problems;

public class Knapsack0_1 {
    public int solve(int[] A, int[] B, int C) {
        int n=B.length;
        int[][] dp=new int[n][C+1];
        for(int i=0;i<n;i++){
            for(int j=1;j<=C;j++){
                dp[i][j]=-1;
            }
        }

        return  check(A,B,C,n-1,dp);
    }

    private int check(int[] a, int[] b, int c, int i, int[][] dp) {
        if(i<0 || c<0){
            return  0;
        }

        if(dp[i][c]!=-1){
            return dp[i][c];
        }
        int ans=check(a,b,c,i-1,dp);

        if(c>=b[i]){
            ans=Math.max(ans,check(a,b,c-b[i],i-1,dp)+a[i]);
        }
        dp[i][c]=ans;
        return  dp[i][c];
    }
}
