package ict;

/**
 * Created by lon on 16-8-15.
 */
public class Solution55 {
    public boolean canJump(int[] nums) {
        if(nums==null || nums.length<=1)return true;
        boolean res = true;
        int lastReachIndex = nums.length-1;
        for (int i = nums.length-1; i >=0 ; i--) {
            if(nums[i]+i>=lastReachIndex){
                lastReachIndex = i;
                res  = true;
            }else{
                res = false;
            }
        }
        return res;

    }


    public boolean canJump1(int [] nums){
        if(nums == nums || nums.length <= 1 ) return true;
        boolean res = true;
        int lastIndex = nums.length-1;
        for (int i = nums.length-1; i >=0 ; i--) {
            if(nums[i]+i>=lastIndex){
                lastIndex = i;
                res = true;
            }else {
                res  = false;
            }
        }
        return res;
    }
}
