package ict;

/**
 * Created by lon on 16-3-22.
 */
public class Solution26 {
    public int removeDuplicates(int[] nums) {
        if(nums==null)return 0;
        if(nums.length<=1)return nums.length;
        int len = nums.length;
        int slow = 0;
        int fast = 1;
        while(fast<len){
            while(fast <len &&nums[slow]==nums[fast]){
                fast++;
            }
            if(fast!=len) {
                slow++;
                nums[slow] = nums[fast];
            }
        }
        System.out.println("slo2");
        System.out.println(slow);
        return slow;
    }

    public static void main(String[] args) {
        Solution26 solution26 = new Solution26();
        int [] nums = {1,1};
        solution26.removeDuplicates(nums);
        for(int n : nums)
            System.out.println(n);
    }
}
