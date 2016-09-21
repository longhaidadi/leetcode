package bianchengzhifa;

import java.util.ArrayList;

/**
 * Created by lon on 16-9-2.
 */
import java.util.List;
public class Solution5 {

    static void mostPand(String str){


    }
    static boolean isValid(String str , int start,int end){
        while (start<end){
            if(str.charAt(start)!=str.charAt(end))return false;
            start++;
            end--;
        }
        return true;
    }

    static List<String> helper(String str){
        List<String> list = new ArrayList<>();
        int [] dp = new int[str.length()];
        dp[0] = 1;
        for (int i = 1; i < str.length(); i++) {
            dp[i]=dp[i-1]+1;
            for (int j = 0; j <i ; j++) {
                if(str.charAt(i) == str.charAt(j) && isValid(str,i,j)){
                    dp[i]=Math.min(dp[i],dp[j-1]+1);
                }else
                    dp[i]=1;
            }
        }
        return list;
    }
}
