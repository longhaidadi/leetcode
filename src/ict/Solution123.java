package ict;

/**
 * Created by lon on 16-7-30.
 */
public class Solution123 {
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length==0)return 0;
        int min = 0;
        int [] left = new int[prices.length];
        left[0]=0;
        for (int i = 1; i <prices.length; i++) {
            min = Math.min(prices[i],min);
            left[i]=Math.max(left[i-1],prices[i]-min);
        }
        int max = Integer.MAX_VALUE;
        int [] right = new int[prices.length];
        right[prices.length-1]=0;
        for (int i = prices.length-1; i >=0 ; i--) {
            max = Math.max(prices[i],max);
            right[i]=Math.max(max-prices[i],right[i-1]);
        }

        int maxProfit = 0;
        for (int i = 0; i <prices.length ; i++) {
                maxProfit = Math.max(left[i]+right[i],maxProfit);
        }
        return maxProfit;
    }
}
