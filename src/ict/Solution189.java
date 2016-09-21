package ict;

/**
 * Created by lon on 16-8-1.
 */
public class Solution189 {
    public void rotate(int[] nums, int k) {
        if(nums==null || nums.length<=k)return;
        helper(nums,0,k);
        helper(nums,k+1,nums.length-1);
        helper(nums,0,nums.length-1);
        for (int i = 0; i < nums.length ; i++) {
            System.out.print(nums[i]+"\t");
        }
    }
    public void helper(int array [] , int start ,int end){
        while (start<end){
            int tmp = array[start];
            array[start]=array[end];
            array[end]=tmp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7};
        new Solution189().rotate(array,3);
    }

}
