package ict;

/**
 * Created by lon on 16-3-27.
 */
public class Solution287 {
    public static void main(String[] args) {

    }
    public int findDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while (left<right){
            int mid = left + (right-left)/2;
            int cn = 0;
            for(int i =0;i<nums.length;i++){
                if(nums[i]<=mid)cn++;
            }
            if(cn<mid){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return left;
    }
}
