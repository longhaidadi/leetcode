package ict;

/**
 * Created by lon on 16-8-4.
 */
public class Solution279 {
    public int numSquares(int n) {
        if(n==0)return 0;
        int[] dp = new int[n+1];
        int number = 1;
        for(int i =1;i<=n;i++){
            if(number * number ==i){
                dp[i]=1;
                number++;
            }else {
                int min = i;
                for(int j = number-1 ; j>0;j--){
                    min= Math.min(min,1+dp[i-j*j]);
                }
                dp[i]=min;
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        new Solution279().numSquares(2);
    }
}
