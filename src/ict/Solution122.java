package ict;

/**
 * Created by lon on 16-5-12.
 */
public class Solution122 {
    public int maxProfit(int[] prices) {
        if(prices==null)return 0;
        int min = prices[0];
        int maxProfit = 0;
        int sum =0;
        for(int i =1;i<prices.length;i++){
            if(prices[i]-min>maxProfit)maxProfit=prices[i]-min;
            if(prices[i]<prices[i-1]){
                min = prices[i];
                sum += maxProfit;
                maxProfit=0;
            }else{
                maxProfit += prices[i]-min;
            }
        }
        return sum;
    }
}
