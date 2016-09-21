package ict;

/**
 * Created by lon on 16-5-12.
 */
import java.util.List;
public class Solution120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int len = triangle.size();
        int[] dp = new int[len];
        for(int i = len-1;i>=0;i++){
            for(int j = 0;j<=i;j++){
                if(i==len-1){
                    dp[j]=triangle.get(i).get(j);
                }else{
                    dp[j]=Math.min(dp[j],dp[j+1])+triangle.get(i).get(j);
                }
            }
        }
        return dp[0];
    }
}
