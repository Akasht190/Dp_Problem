package DP_Problems;
import java.util.*;
public class Stairs {
    public int climbStairs(int A) {
        int[] dp=new int[A+1];
        Arrays.fill(dp,-1);

        return count(dp,A);
    }

    private int count(int[] dp, int a) {
        int  mod=1000000007;

        if(a==1 || a==0){
            return 1;
        }

        if(dp[a]!=-1){
            return dp[a]%mod;
        }

        if(dp[a]==-1){
            dp[a]=count(dp,a-1)+count(dp,a-2);
        }
        return dp[a]%mod;

    }


}
