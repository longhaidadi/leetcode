package ict;

/**
 * Created by lon on 16-5-12.
 */
public class Solution134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int left = 0;
        int startPoint = 0;
        int sum = 0;
        for(int i =0;i<gas.length;i++){
            int t = gas[i]-cost[i];
            left += t;
            if(left<0){
                startPoint= i+1;
                left=0;
            }
            sum+=t;
        }
        return left>=0?startPoint:-1;
    }
}
