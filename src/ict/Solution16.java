package ict;

import java.util.Arrays;

/**
 * Created by lon on 16-3-23.
 */
public class Solution16 {
    public int threeSumClosest(int[] nums, int target) {
        if(nums==null || nums.length<3) return 0;
        Arrays.sort(nums);
        int i =0;
        int ret = target>=0?Integer.MAX_VALUE:Integer.MIN_VALUE;
        while (i<nums.length-2){
            int l = i+1;
            int r = nums.length-1;
            System.out.println(i + "\t"+ l + "\t" + r);
            while (l<r){
                int curSum  = nums[i]+nums[l]+nums[r];
                if(Math.abs(curSum-target)<Math.abs(ret-target)){
                    ret = curSum;
                }
                if(curSum<target) {
                    l++;
                    while (l<r&&nums[l] == nums[l - 1]) l++;
                }else if(curSum>target){
                    r--;
                    while (l<r&&nums[r]==nums[r+1])r--;
                }else {
                    return curSum;
                }

            }
            i++;
            while (i<nums.length-2 && nums[i] == nums[i-1] )i++;
        }
        return ret;
    }

    public static void main(String[] args) {
        Solution16 solution16 = new Solution16();
        int[] nums = {0,1,2};
        System.out.println(solution16.threeSumClosest(nums,0));
    }
}
