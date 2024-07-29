package DP_Problems;

public class Maximum_Sum_Value {
    public int solve(int[] A, int B, int C, int D) {
        int maxf=Integer.MIN_VALUE;
        int maxS=Integer.MIN_VALUE;
        int maxD=Integer.MIN_VALUE;

        for(int i=1;i<=A.length;i++){
            maxf=Math.min(maxf,A[i]*B);
            maxS=Math.min(maxS,A[i]*C+maxf);
            maxD=Math.min(maxD,A[i]*D+maxS);
        }
        return  maxD;
    }
}
