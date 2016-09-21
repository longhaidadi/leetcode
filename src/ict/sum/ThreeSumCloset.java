package ict.sum;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by lon on 16-6-22.
 */
public class ThreeSumCloset {
    public int threeSumClosest(int[] nums, int target) {
        if(nums==null || nums.length<3)return -1;
        Arrays.sort(nums);
       int closet = Integer.MAX_VALUE;
        if(target<0)closet=Integer.MIN_VALUE;
        for (int i = 0; i <nums.length-2 ; i++) {
            int left = i +1;
            int right = nums.length-1;
            while (left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum==target){
                    return target;
                }else if(sum<target)
                    left++;
                else right--;
                closet = Math.abs(sum-target)<Math.abs(closet-target)?sum:closet;
            }
        }
        return closet;
    }

    public static void main(String[] args) {
        int [] array = {-3,-2,-5,3,-4};
        new ThreeSumCloset().threeSumClosest(array,-1);
    }
}
