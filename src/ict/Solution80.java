package ict;

/**
 * Created by lon on 16-5-4.
 */
public class Solution80 {
    public static void main(String[] args) {
        Solution80 solution80 = new Solution80();
        int [] array = {1,1,1,2,2,3};
        int ret = solution80.removeDuplicates(array);
        System.out.println(ret);
    }
    public int removeDuplicates(int[] nums) {
        if(nums==null)return 0;
        int len = 1;
        int startPos = 1;
        for(int i =1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                if(len<2){
                    nums[startPos++]=nums[i];
                    len++;
                }
            }else {
                len=1;
                nums[startPos++]=nums[i];
            }
        }
        return startPos;
    }

    public int removeDuplicates1(int[] nums){
        if(nums==null || nums.length==0)return 0;
        int curLen = 1;
        int startPos = 1;
        for (int i = 1; i <nums.length ; i++) {
            if(nums[i-1]==nums[i]){
                if(curLen<2) {
                    curLen++;
                    nums[startPos++]=nums[i];
                }
            }else{
                curLen = 1;
                nums[startPos++] = nums[i];
            }
        }
        return startPos;
    }
}
