package niuke;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by lon on 16-5-30.
 */
public class NumberOf1Between1AndN_Solution {
    public static void main(String[] args) {

       int ret =  new NumberOf1Between1AndN_Solution().NumberOf1Between1AndN_Solution(10000);
        System.out.println(ret);
    }
    public int NumberOf1Between1AndN_Solution(int n) {
        if(n<=0)return 0;
        return helper(String.valueOf(n));
    }

    private int helper(String str){
        if(str.equals(""))return 0;

        int start = 0;
        char [] array = str.toCharArray();
        char firstChar = array[start];
        if(str.length()==1){
            if(firstChar=='0')
                return 0;
            return 1;
        }
        int firstNo = 0;
        if(firstChar=='1')
            firstNo = Integer.parseInt(str.substring(start+1))+1;
        else if(firstChar>'1') firstNo = (int) Math.pow(10,array.length-1);

        int otherNo = (int) Math.pow(10,array.length-2)*(firstChar-'0')*(array.length-1);

        return firstNo+otherNo+helper(str.substring(start+1));
    }

}
