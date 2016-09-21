package ict;

/**
 * Created by lon on 16-3-23.
 */
public class Solution27 {
    public static void main(String[] args) {

        Solution27 solution27 = new Solution27();
    }
    public int removeElement(int[] nums, int val) {
        int len = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=val)
                nums[len++]=nums[i];
        }
        return len;
    }
}
