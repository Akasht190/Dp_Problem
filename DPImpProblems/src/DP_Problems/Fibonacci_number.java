package DP_Problems;
//Tc-o(n) sc=o(n)

import java.lang.reflect.Array;
import java.util.*;

public class Fibonacci_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int dp[]=new int[n];
        Arrays.fill(dp,-1);

        System.out.println(func(n,dp));
    }

    private static int func(int n, int[] dp) {
        if(n==0 || n==1){
            return n;
        }

        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=func(n-1,dp)+func(n-2,dp);
        return dp[n];
    }

}
