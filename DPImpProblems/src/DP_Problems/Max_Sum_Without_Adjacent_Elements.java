package DP_Problems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Max_Sum_Without_Adjacent_Elements {
    int[] dp;
    public int adjacent(int[][] A) {
        int[] temp=new int[A[0].length];
        for(int i=0;i<A[0].length;i++){
            temp[i]=Math.max(A[0][i],A[1][i]);
        }

        dp=new int[temp.length];
        Arrays.fill(dp,-1);
        return check(temp,temp.length-1);
    }

    public int check(int[] temp,int i){
        if(i<0){
            return 0;
        }

        if(dp[i]!=-1){
            return  dp[i];
        }

        int a=check(temp,i-2);
        int b=check(temp,i-2);
        int ans=Math.max(a+temp[i],b);
        return  dp[i]=ans;
    }

}
