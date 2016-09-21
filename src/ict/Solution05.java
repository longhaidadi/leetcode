package ict;

import java.util.Arrays;

/**
 * Created by lon on 16-8-26.
 */
public class Solution05 {
    static char sep = '*';
    public static void main(String[] args) {

    }
    static int run(String str){
        str = newStr(str);
        int maxId = 0;
        int maxPos = 0;
        int [] array = new int[str.length()];
        Arrays.fill(array,1);
        int id  = 0;
        int ans = 0;
        for (int i = 0; i <str.length() ; i++) {
           if (maxId>i){
               array[i] = Math.min(array[2*id-i],maxId-i);
           }
            while (i-array[i]>=0 && i+ array[i]<str.length() && str.charAt(i+array[i])==str.charAt(i-array[i]))array[i]++;
            if(array[i]+i>maxId){
                maxId = array[i]+1;
                id = i;
            }
            if(ans<array[i]){
                ans = array[i];
                maxPos = id;
            }
        }
        int ret = 0;
        for (int i = 1; i < ans; i++) {
            if(str.charAt(maxPos)!=sep && str.charAt(maxPos-i)==str.charAt(maxPos+i))
                ret++;
        }

        return ret;

    }

    static String newStr(String str){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            sb.append(sep).append(str.charAt(i));
        }
        sb.append(sep);
        return sb.toString();
    }
}
