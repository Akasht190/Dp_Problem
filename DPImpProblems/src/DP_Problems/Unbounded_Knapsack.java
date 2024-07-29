package DP_Problems;

public class Unbounded_Knapsack {
    public int solve(int A, int[] B, int[] C) {
        int n=C.length;
        int[][] dp=new int[n][A+1];
        for(int i=0;i<n;i++){
            for(int j=1;j<=A;j++){
                dp[i][j]=0;
            }
        }
        return  check(A,B,C,n-1,dp);
    }

    private int check(int a, int[] b, int[] c, int i, int[][] dp) {
        if(i<0 || a==0){
            return  0;
        }

        if(dp[i][a]==-1){
            return  dp[i][a];
        }
        int ans=check(a,b,c,i-1,dp);
        if(a>=c[i]){
            ans=Math.max(ans,check(a,b,c,i,dp)+b[i]);
        }
        dp[i][a]=ans;
        return  dp[i][a];
    }
}
