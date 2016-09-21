package ict;

/**
 * Created by lon on 16-6-19.
 */
public class Solution69 {
    public static void main(String[] args) {
        int ret = new Solution69().mySqrt(1);
        System.out.println(ret);
    }
    public int mySqrt(int x){
        int p =0;
        int q = x;
        while (p<q){
            q = Math.max(1,p+(q-p)>>1);
            p = x/q;
        }
        return p<q?p:q;
    }
    public int mySqrt1(int x){
        int p =0;
        int q =x;
        while (p<q){
            q = Math.max(1,p+(q-p)>>1);
            p = x/q;
        }
        return p<q?p:q;
    }
}
