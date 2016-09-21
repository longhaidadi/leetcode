package ict;

/**
 * Created by lon on 16-4-5.
 */
public class Solution50 {
    public double myPow(double x, int n) {
        if(n==0)return 1;
        if(n==Integer.MIN_VALUE){
            if(x>1)return 0L;
            else if(x<=1)return 1L;
        }
        if(n<0){
            x = 1/x;
            n = -n ;
        }
        return myPow1(x,n);
    }
    public double myPow1(double x,int n){
        if(n==0)return 1L;
        double v = myPow(x,n/2);
        if(n%2==1)return v*v*x;
        return v*v;
    }

    public static void main(String[] args) {
        Solution50 solution50 = new Solution50();
    }
}
