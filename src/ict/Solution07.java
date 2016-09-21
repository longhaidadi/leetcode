package ict;

/**
 * Created by lon on 16-3-21.
 */
public class Solution07 {
    public static void main(String[] args) {
        Solution07 convertInt7 = new Solution07();
        convertInt7.reverse(10);
    }
    public int reverse(int x){
        int ret = 0;
        boolean isPositive = x>0?true:false;
        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;
        if(x==minValue || x ==0 ) return  0;
        long data = Math.abs(x);
        while (data!=0) {
            if (isPositive  && (ret > maxValue/10 || (ret==maxValue/10)&& data%10> maxValue%10))
                return 0;
            else if (!isPositive && (ret<maxValue/10 || (ret==minValue/10) && data %10 < minValue %10))
                return 0;
            ret = ret * 10 + (int)(data%10);
            data /= 10;
        }
        return  ret;
    }
}
