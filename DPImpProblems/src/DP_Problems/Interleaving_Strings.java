package DP_Problems;

public class Interleaving_Strings {
    public int isInterleave(String A, String B, String C) {
        if(C.length()!=(A.length()+B.length())){
            return 0;
        }

        if(check(A,0,B,0,C,0)){
            return 1;
        }
        return 0;
    }

    public boolean check(String A,int i,String B,int j,String C, int k){
        if(i==A.length() && j==B.length()){
            if(k==C.length()){
                return true;
            }
        }

        if(k>=C.length()){
            return false;
        }

        boolean flag=false;
        boolean flag1=false;
        boolean flag2=false;

        if(i<A.length() && A.charAt(i)==C.charAt(k)){
            flag1=check(A,i+1,B,j,C,k+1);
        }
        if(j<B.length() && B.charAt(j)==C.charAt(k)){
            flag2=check(A,i,B,j+1,C,k+1);
        }

        flag=flag1 | flag2;
        return flag;
    }
}
