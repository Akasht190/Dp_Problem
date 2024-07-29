package DP_Problems;

import java.util.Arrays;

public class UniquePaths_In_a_grid {
    public int uniquePathsWithObstacles(int[][] A) {
        int n=A.length;
        int[][] dp=new int[A.length][A[0].length];

        for(int i=0;i<n;i++){
            Arrays.fill(dp,-1);
        }
        return  check(A,A.length-1,A[0].length-1,dp);
    }

    public  int check(int[][] A,int i,int j,int[][] dp){
        if(A[i][j]==1) return 0;
        if(i==0 || j==0) return  1;

        if(dp[i][j]!=-1){
            return  dp[i][j];
        }

        int left=(i==0)?0:check(A,i-1,j,dp);
        int right=(j==0)?0:check(A,i,j-1,dp);
        dp[i][j]=left+right;
        return  dp[i][j];
    }
}
