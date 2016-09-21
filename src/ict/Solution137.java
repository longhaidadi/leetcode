package ict;

import java.util.Arrays;

/**
 * Created by lon on 16-5-12.
 */
public class Solution137 {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i =0;
        for(;i<nums.length;){
            if(nums[i]==nums[i+1] && nums[i+1]==nums[i+2] )
                i += 3;
            else
                return nums[i];
        }
        return 0;
    }
}
