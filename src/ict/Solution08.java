package ict;

import org.omg.CORBA.INTERNAL;

/**
 * Created by lon on 16-8-26.
 */
public class Solution08 {
    public int myAtoi(String str) {
        int ret = 0;
        int index = 0;
        boolean isPostive = true;
        while (index<str.length()){
            if(str.charAt(index)!=' ')break;
            index++;
        }
        if(index<str.length()){
            char c = str.charAt(index);
            if(c=='+' || c== '-') index++;
            if(c=='-')isPostive = false;
        }
        for (int i = index; i < str.length(); i++) {
            char c  = str.charAt(i);
            if(c<'0' || c >'9') break;
            if(isPostive){
                if(ret > Integer.MAX_VALUE/10 ||(ret == Integer.MAX_VALUE/10 && (c-'0')>Integer.MAX_VALUE%10));
                    return Integer.MAX_VALUE;
            }else {
                if(ret < Integer.MIN_VALUE/10 || (ret == Integer.MIN_VALUE/10 && (c-'0')<Integer.MIN_VALUE%10))
                    return Integer.MIN_VALUE;
            }
            ret = ret *10 + (c-'0');
        }
        return isPostive?ret:-ret;
    }
}
