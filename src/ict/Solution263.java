package ict;

/**
 * Created by lon on 16-3-27.
 */
public class Solution263 {
    public boolean isUgly(int num) {
        if(num<=0) return false;
        while(num%2==0)
            num /= 2;
        while (num%3==0)
            num /=3;
        while (num%5==0)
            num /=5;
        return num==1?true:false;

    }

    public static void main(String[] args) {
        Solution263 solution263 = new Solution263();

    }
}
