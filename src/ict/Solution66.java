package ict;

import java.util.Arrays;

/**
 * Created by lon on 16-3-27.
 */
public class Solution66 {
    public static void main(String[] args) {
        Solution66 solution66 = new Solution66();
        int [] digits = {1};
        int [] ret = solution66.plusOne(digits);
        for(int r : ret)
            System.out.println(r);
    }

    public int [] plusOne(int [] digits){
        int [] ret = new int[digits.length+1];

        int one =1 ;
        for(int i = ret.length-1;i>0;i--){
            ret[i]=(digits[i-1]+one)%10;
            one = (digits[i-1]+one)/10;
        }
        if(one==1){
            ret[0]=1;
            return ret;
        }else{
            return Arrays.copyOfRange(ret,1,ret.length);
        }
    }

}
