package ict;

/**
 * Created by lon on 16-5-3.
 */
public class Solution75 {
    public static void main(String[] args) {
        Solution75 solution75 = new Solution75();
        int [] nums = {2,0};
        solution75.sortColors(nums);
    }
    public void sortColors(int[] nums) {
        if(nums==null || nums.length==0)return;
        int j =0;
        int k = nums.length-1;
        int i =0;
        while(i<=k){
            int t = nums[i];
            if(t==0){
                swap(nums,i,j);
                i++;
                j++;
            }
            else if(t==2){
                swap(nums,i,k);
                k--;
            }else i++;
        }
    }
    private void swap(int [] nums,int i,int j){
        int t = nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
}
