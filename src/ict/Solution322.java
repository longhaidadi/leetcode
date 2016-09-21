package ict;

/**
 * Created by lon on 16-3-22.
 */
public class Solution322 {
    public static void main(String[] args) {

    }

    public int coinChange(int[] coins, int amount) {
        // dp[c+i] = min(dp[i]+1,dp[c+i])
        int [] dp = new int[amount+1];
        for(int i =1;i< dp.length;i++)
            dp[i]=-1;
        dp[0]=0;
        for(int i =0;i<=amount;i++){
            if(dp[i]<0)continue;
            for(int coin: coins){
                if(i+coin>amount)continue;
                if(dp[i+coin]==0 || dp[i+coin]>dp[i]+1)
                    dp[i+coin]=dp[i]+1;
            }
        }
        return dp[amount];
    }

}
