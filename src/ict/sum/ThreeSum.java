package ict.sum;

/**
 * Created by lon on 16-6-22.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ThreeSum{
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        if(nums==null || nums.length<3)return lists;
        Arrays.sort(nums);
        for (int i = 0; i <nums.length-2 ; i++) {
            int target = -nums[i];
            int left = i+1;
            int right = nums.length-1;
            if(i!=0 && nums[i]==nums[i-1])continue;
            while (left<right){
                int sum = nums[left]+nums[right];
                if(sum==target){
                    List<Integer> list = new ArrayList<>(3);
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    lists.add(list);
                    left++;
                    right--;
                }else if(sum<target) left++;
                else right--;
            }
        }
        return lists;
    }

    public static void main(String[] args) {
        int [] array = {-1,0,1,2,-1,-4};
        new ThreeSum().threeSum(array);
    }
}
