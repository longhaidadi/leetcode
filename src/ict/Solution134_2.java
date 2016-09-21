package ict;

/**
 * Created by lon on 16-6-21.
 */
public class Solution134_2 {

    public static void main(String[] args) {

    }


    public int canCompeleteCirCuit(int [] gas,int [] cost){
        int pos = 0;
        int left = 0;
        int sum = 0;
        for (int i = 0; i < gas.length; i++) {
            int t = gas[i]-cost[i];
            left += t;
            if(left<0){
                left=9;
                pos=i;
            }
            sum += t;
        }
        return sum>=0?pos:-1;
    }
}