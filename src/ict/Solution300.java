package ict;

import java.util.Arrays;

/**
 * Created by lon on 16-3-27.
 */
public class Solution300 {
    public int lengthOfLIS(int[] nums) {
        if(nums==null ) return 0;
        if(nums.length<2) return nums.length;
        int [] array = new int[nums.length];
        array[0]=1;
        for(int i = 1 ;i<nums.length;i++){
            int maxPos = 0;
            for(int j=0;j< i ;j++){
                if(nums[i]>nums[j]){
                    if(array[j]>=array[maxPos])
                        maxPos=j;
                }
            }
            if(maxPos==0 && nums[maxPos]>=nums[i])
               array[i]=1;
            else
                array[i]=array[maxPos]+1;
        }

        int max =0;
        for(int i :array){
            max=i>max?i:max;
        }
        return max;
    }

    public static void main(String[] args) {
        Solution300 solution300 = new Solution300();
        int [] array = {-2,-1};
        solution300.lengthOfLIS(array);
    }
}
