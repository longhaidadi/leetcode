package ict;

/**
 * Created by lon on 16-5-12.
 */
public class Solution344 {
    public String reverseString(String s) {
        if(s==null)return s;
        int len = s.length();
        if(len<2)return s;
        char []array = s.toCharArray();
        for(int i =0;i<=(len-1)/2;i++){
            char t = array[i];
            array[i]=array[len-1-i];
            array[len-1-i]=t;
        }
        return new String(array);
    }
}
