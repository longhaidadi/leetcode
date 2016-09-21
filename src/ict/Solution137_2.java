package ict;

/**
 * Created by lon on 16-6-21.
 */
public class Solution137_2 {
    public int singleNumber(int [] numbers){
        if(numbers.length<3)return numbers[0];
        int [] array = new int[32];
        int ret = 0;
        for (int i = 0; i <32 ; i++) {
            for (int j = 0; j <numbers.length ; j++) {
                array[i] += (numbers[i]>>i)&1;
            }
            ret ^= ((array[i]%3)<<i);
        }
        return ret;
    }
}
