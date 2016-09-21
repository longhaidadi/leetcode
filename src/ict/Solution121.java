package ict;

/**
 * Created by lon on 16-5-12.
 */
public class Solution121 {
    public int maxProfit(int[] prices) {
        if(prices==null)return 0;
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0;i<prices.length;i++){
            if(prices[i]<min)min=prices[i];
            if(prices[i]-min>maxProfit)maxProfit=prices[i]-min;
        }
        return maxProfit;
    }
}
