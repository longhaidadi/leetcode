package ict;

/**
 * Created by lon on 16-8-1.
 */
public class Solution190 {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i <32 ; i++) {
            result <<= 1;
            if((n&1)==1)result++;
            n >>=1;
        }
        return result;
    }
}
