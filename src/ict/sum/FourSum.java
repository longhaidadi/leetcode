package ict.sum;

/**
 * Created by lon on 16-6-22.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        if(nums==null || nums.length<4)return lists;
        Arrays.sort(nums);
        for (int i = 0; i <nums.length-3 ; i++) {
            if(i!=0 && nums[i]==nums[i-1])continue;
            for (int j = i+1; j <nums.length-2 ; j++) {
                if(j!=i+1 && nums[j]==nums[j-1] )continue;
                int left = j+1;
                int right = nums.length-1;
                while (left<right){
                    int sum = nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target){
                        List<Integer>list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        lists.add(list);
                        left++;
                        right--;
                        while (left<right && nums[left]==nums[left-1])left++;
                        while (left<right && nums[right]==nums[right+1])right--;
                    }else if(sum<target)left++;
                    else right--;
                }
            }
        }
        return lists;
    }

    public static void main(String[] args) {
        int [] array = {1,0,-1,0,-2,2};
        new FourSum().fourSum(array,0);
    }
}
