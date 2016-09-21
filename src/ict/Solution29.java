package ict;

/**
 * Created by lon on 16-3-28.
 */
public class Solution29 {
    public int divide(int dividend, int divisor) {
        if(divisor==0) return 0;
        if(divisor==1) return dividend;
        if(divisor==-1){
            if(dividend==Integer.MAX_VALUE)return Integer.MIN_VALUE;
            else if(dividend==Integer.MIN_VALUE) return Integer.MAX_VALUE;
            else
                return -dividend;
        }

        boolean sign=true;
        if(dividend<0)sign=!sign;
        if(divisor<0)sign=!sign;

        long tmp1 = Math.abs((long)dividend);
        long tmp2 = Math.abs((long)divisor);
        long cn = 1;
        while (tmp1>tmp2){
            tmp2 = tmp2<<1;
            cn = cn<<1;
        }
        long ret = 0;
        while (tmp1>=Math.abs((long)divisor)){
            while (tmp1>=tmp2){
                tmp1 = tmp1-tmp2;
                ret = ret+cn;
            }
            tmp2 = tmp2>>1;
            cn =cn>>1;
        }
        return sign?(int)ret:(int)-ret;
    }
}
