package ict;

/**
 * Created by lon on 16-4-5.
 */
public class Solution35 {
    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }
    public int binarySearch(int [] nums,int l ,int r ,int target){
        if(nums==null) return 0;
        while (l<=r){
            int mid = l+(r-l)>>1;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                if(mid==nums.length-1  || nums[mid+1]>target){
                    return mid+1;
                }else
                    l = mid+1;
            }else if (nums[mid]>target){
                if(mid==0 || nums[mid-1]<target){
                    return mid;
                }else
                    r=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] array = {2,3};
        Solution35 solution35 = new Solution35();
        solution35.searchInsert(array,3);
    }
}
