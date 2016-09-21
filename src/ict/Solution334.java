package ict;

/**
 * Created by lon on 16-8-4.
 */
public class Solution334 {
    public boolean increasingTriplet(int[] nums) {
        if(nums==null || nums.length<3)return false;
        int small = nums[0];
        int middle = Integer.MAX_VALUE;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]>middle){
                return true;
            }
            if(nums[i] < middle && nums[i] > small){
                middle = nums[i];
            }else if(nums[i]<small)small = nums[i];
        }
        return false;
    }
}
