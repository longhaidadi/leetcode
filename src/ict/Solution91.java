package ict;

/**
 * Created by lon on 16-5-4.
 */
public class Solution91 {
    public static void main(String[] args) {
        Solution91 solution91 = new Solution91();
        int ret = solution91.numDecodings("110");
        System.out.println(ret);
    }

    public int numDecodings(String s) {
        if(s==null)return 0;
        int len = s.length();
        int [] dp = new int[len+1];
        dp[len]=1;
        dp[len-1]=s.charAt(len-1)=='0'?0:1;
        for (int i = len-2; i >=0 ; i--) {
            if(s.charAt(i)=='0')continue;
            dp[i]=Integer.parseInt(s.substring(i,i+2))<=26?dp[i+1]+dp[i+2]:dp[i+1];
        }
        return dp[0];

    }
    public int numDecodings1(String s){
        if(s==null || s.isEmpty())return 0;
        int len = s.length();
        int []dp = new int[len+1];
        dp[len]=1;
        dp[len-1]=s.charAt(len-1)=='0'?0:1;
        for (int i = len-2; i >=0 ; i--) {
            if(s.charAt(i)=='0')continue;
            dp[i] = Integer.parseInt(s.substring(i,i+2))<=26?dp[i+1]+dp[i+2]:dp[i+1];
        }
        return dp[0];
    }
}
