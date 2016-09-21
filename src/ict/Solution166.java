package ict;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by lon on 16-3-27.
 */
public class Solution166 {
    public static void main(String[] args) {
        Solution166 solution166 = new Solution166();
        String ret = solution166.fractionToDecimal(1,17);
        System.out.println(ret);
    }
    public String fractionToDecimal(int numerator, int denominator) {
        boolean sign = true;
        sign = (numerator>0) ^(denominator>0);

        int n = numerator;
        int d = denominator;
        if(n==0) return "0";
        StringBuffer ret = new StringBuffer();
        if (!sign)ret.append("-");
        long ln = Math.abs((long)n);
        long ld = Math.abs((long)d);
        ret.append(ln/ld);
        long rem = ln% ld;
        if(rem==0)return ret.toString();
        ret.append(".");
        rem = rem*10;
        Map<Long,Integer> map = new HashMap<Long,Integer>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int idx = 0; rem != 0; ++idx) {
            if(!map.containsKey(rem)){
                map.put(rem, idx);
                stringBuilder.append(rem/ld);
                rem =(rem%ld)* 10;
            }else{
                stringBuilder.insert(map.get(rem),"(");
                stringBuilder.append(")");
                break;

            }
        }
        ret.append(stringBuilder);
        return ret.toString();
    }

}
