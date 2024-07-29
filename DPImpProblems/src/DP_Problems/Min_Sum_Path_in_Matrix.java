package DP_Problems;

import java.util.Arrays;

public class Min_Sum_Path_in_Matrix {
    int[][] arr;
    int[][] dp;
    public int minPathSum(int[][] A) {
        int n=A.length;
        int m=A[0].length;
        arr=A;

        if(n==1 || m==1){
            return  A[0][0];
        }

        dp=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }

        return sum(n-1,m-1);
    }
    private  int sum(int i,int j){
        if(i<0 || j<0){
            return  Integer.MAX_VALUE;
        }
        if(i==0 || j==0){
            return  arr[0][0];
        }
        if(dp[i][j]!=-1){
            return  dp[i][j];
        }

        dp[i][j]=Math.min(sum(i-1,j),sum(i,j-1))+arr[i][j];
        return  dp[i][j];
    }

}
