package ict;

/**
 * Created by lon on 16-8-1.
 */
public class Solution191 {
    public int hammingWeight(int n) {
        int count =0;
        while (n!=0){
            n = n & (n-1);
        }
        return count;
    }
}
