package DP_Problems;

public class Ways_to_send_the_signal {
    public int solve(int A) {
        double mod=Math.pow(10,9)+7;
        if(A==0) return  0;
        if(A==1) return  2;
        int[] dp=new int[A+1];
        dp[0]=0;
        dp[1]=2;
        int offsignal=1;

        for(int i=2;i<=A;i++){
            dp[i]=(int) ((dp[i-1]+offsignal)%mod);
            offsignal=dp[i-1];
        }

        return  (int)(dp[A]%mod);
    }
}
