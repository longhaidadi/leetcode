package ict;

/**
 * Created by lon on 16-4-25.
 */
public class Solution41 {
    public static void main(String[] args) {

    }
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int [] array = new int[n];
        for(int i =0;i<n;i++){
            if(nums[i]<n &&nums[i]>=0 )
                array[nums[i]]=1;
        }

        for(int i = 1;i<n;i++)
            if(array[i]==0)
                return i+1;
        return 1;

    }

    public int firstMissingPositive1(int[] nums){
        if(nums==null || nums.length==0)return 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==i+1 || nums[i]<=0 || nums[i]>nums.length) i++;
            else if (nums[i]!=nums[nums[i]-1])swap(nums, i,nums[i]);
            else i++;
        }
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]!=i+1)return i+1;
        }
        return 1;
    }
    public void swap(int [] nums ,int i ,int j){
        int t = nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
}
