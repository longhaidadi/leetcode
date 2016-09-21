package ict;

/**
 * Created by lon on 16-4-5.
 */
public class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        int [] ret = new int [2];
        ret[0] = getInt(nums,target,0,nums.length,false);
        ret[1] = getInt(nums,target,0,nums.length,true);
        return ret;
    }
    private int getInt(int [] nums,int target,int l,int r,boolean isLeft){
        while (r<nums.length && l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid]==target){
                if(isLeft){
                    if(mid==0 || nums[mid-1]<target)return mid;
                    else r = mid-1;
                }else{
                    if(mid==nums.length-1 || nums[mid+1]>target) return mid;
                    else l = mid+1;
                }
            }else  if(nums[mid]<target){
                l = mid+1;
            }else{
                r = mid -1;
            }
        }
        return -1;
    }

    private int getInt1(int [] nums , int target,int l ,int r , boolean isLeft){
        while (r<=r){
            int mid = l+ (r-l)>>1;
            if(nums[mid]==target){
                    if(isLeft){
                        if(mid == 0 || nums[mid-1]<target)return mid;
                        else r = mid-1;
                    }else{
                        if(mid == nums.length-1 || nums[r+1]>target)return mid;
                        else l = mid +1;
                    }
            }else if (nums[mid]<target){
                l = mid +1;
            }else
                r = mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] array = {2,2};
        Solution34 solution34 = new Solution34();
        solution34.searchRange(array,3);
    }

}
