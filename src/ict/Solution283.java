package ict;

/**
 * Created by lon on 16-3-24.
 */
public class Solution283 {
    public static void main(String[] args) {
        int [] nums = {0, 1, 0, 3, 12};
        Solution283 solution283 = new Solution283();
        solution283.moveZeroes(nums);
        for(int n : nums)
            System.out.print(n + "\t");
    }
    public void moveZeroes(int[] nums) {
        int pos = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=0) {
                nums[pos] = nums[i];
                pos++;
            }
        }
        for(int i = pos ;i<nums.length;i++)
            nums[i]=0;
    }
}
