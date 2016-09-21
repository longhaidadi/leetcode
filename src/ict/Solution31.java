package ict;

/**
 * Created by lon on 16-2-21.
 */
public class Solution31 {

    public static void nextPermutation(int[] nums){
        if(nums==null || nums.length==0)return;
        if(nums.length==1) {
            System.out.println(nums[0]);
            return;
        }
        int len  = nums.length;
        int i ;
        for (i = len-1-1; i >=0 ; i--) {
            if(nums[i]<nums[i+1])break;
        }
        if(i==0) for (int j = 0; j <len ; j++) {
            System.out.print(nums[len-1-j]);
            return;
        }
        int j ;
        for ( j = len-1; j >=0 ; j--) {
            if(nums[j]>nums[i])break;
        }
        swap(nums,i,j);
        j = i+1;
        len--;
        while (j<len){
            swap(nums,j,len);
            j++;len--;
        }

        for (int k = 0; k <nums.length ; k++) {
            System.out.print(nums[k]);
        }
    }

    public static void swap(int[]nums,int a,int b){
        int t = nums[a];
        nums[a]=nums[b];
        nums[b] = t;
    }
    public static void main(String[] args) {
        int [] nums = {1,1};

        nextPermutation(nums);
    }
}
