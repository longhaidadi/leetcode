package ict;

/**
 * Created by lon on 16-4-21.
 */
public class Solution33 {
    public static void main(String[] args) {
        Solution33 solution33 = new Solution33();
        int [] array = {3,1};
        int pos = solution33.search(array,1);
        System.out.println(pos);
    }
    public int search(int[] nums, int target) {
        return binarySearch(nums,target);
    }
    public int  binarySearch(int [] nums,int target){
        int pos = -1;
        int left = 0;
        int right =nums.length-1;
        while(left<=right){
            int mid = left+ ((right-left)>>1);
            if(nums[mid]==target)
                return mid;
            if(nums[mid]>nums[left]){
                if(nums[mid]>target && nums[left]<=target)
                    right=mid-1;
                else
                    left=mid+1;
            }else if(nums[mid]<nums[left]){
                if(nums[mid]<target && nums[right]>=target)
                    left=mid+1;
                else right=mid-1;
            }else {
                left=mid+1;
            }
        }
        return pos;
    }
}
