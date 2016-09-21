package ict;

/**
 * Created by lon on 16-4-29.
 */
public class Solution53 {
    public static void main(String[] args) {
        int [] array = {-2,1,-3,4,-1,2,1,-5,4};
        int ret = new Solution53().maxSubArray(array);
        System.out.println(ret);
    }
    public int maxSubArray(int[] nums) {
        if(nums==null || nums.length==0)return 0;
        int sum =nums[0];
        int maxSum = sum;
        for(int i=1;i<nums.length;i++){
            if(sum<0){
                sum = 0;
            }
            sum += nums[i];
            if(sum>maxSum)maxSum=sum;
        }
        return maxSum;
    }
}
