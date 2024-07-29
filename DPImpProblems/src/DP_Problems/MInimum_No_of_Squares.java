package DP_Problems;

import java.util.Arrays;

public class MInimum_No_of_Squares {
    public int countMinSquares(int A) {
        int dp[] =new int[A+1];
        Arrays.fill(dp,-1);
        return count(dp,A);
    }

    private int count(int[] dp, int A) {
        int i=1;
        int ans=Integer.MIN_VALUE;

        if(A==0){
            return 0;
        }

        if(dp[A]==-1){
            if(i*i<=A){
                ans=Math.min(ans,count(dp,(A-i*i)));
                i=i+1;
            }
            dp[A]=ans+1;
        }
        return dp[A];
    }

}
