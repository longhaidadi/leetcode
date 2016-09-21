package ict;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by lon on 16-3-21.
 */
public class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        Arrays.sort(nums);

        for (int i  =0 ;i<=nums.length-2;i++){
            if(i!=0 && nums[i]==nums[i-1])continue;
            int target = -nums[i];
            int l = i+1;
            int r = nums.length-1;
            while (l<r){
                if(nums[l]+nums[r]==target){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[l]);
                    temp.add(nums[r]);
                    ret.add(temp);
                    l++;
                    r--;
                    while (nums[r] == nums[r+1]) r--;
                    while (nums[l] == nums[l-1]) l++;
                }else if(nums[l]+nums[r]<target){
                   l++;
                }else{
                   r--;
                }
            }

        }
        return ret;
    }


    public static void main(String[] args) {
        Solution15 solution15 = new Solution15();
        int [] sum = {8,5,12,3,-2,-13,-8,-9,-8,10,-10,-10,-14,-5,-1,-8,-7,-12,4,4,10,-8,0,-3,4,11,-9,-2,-7,-2,3,-14,-12,1,-4,-6,3,3,0,2,-9,-2,7,-8,0,14,-1,8,-13,10,-11,4,-13,-4,-14,-1,-8,-7,12,-8,6,0,-15,2,8,-4,11,-4,-15,-12,5,-9,1,-2,-10,-14,-11,4,1,13,-1,-3,3,-7,9,-4,7,8,4,4,8,-12,12,8,5,5,12,-7,9,4,-12,-1,2,5,4,7,-2,8,-12,-15,-1,2,-11};

        solution15.threeSum(sum);
    }
}
