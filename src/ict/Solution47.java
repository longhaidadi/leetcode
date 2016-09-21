package ict;
import java.util.*;

/**
 * Created by lon on 16-4-25.
 */
public class Solution47 {

    public static void main(String[] args) {
        int [] nums =  {0,1,0,0,9};
        System.out.println(new Solution47().permuteUnique(nums));
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        Arrays.sort(nums);
        dfs(0,nums,ret);
        return ret;
    }
    public void dfs( int pos ,int [] nums , List<List<Integer>> ret){
        if(pos == nums.length){
            List<Integer> tmp = new ArrayList<>();
            for (int i = 0; i <pos ; i++) {
                tmp.add(nums[i]);
            }
            ret.add(tmp);
            return;
        }
        Set<Integer> set = new HashSet<>();

        for(int i = pos; i<nums.length;i++){
            if(i!=pos && nums[i]==nums[i-1] || set.contains(nums[i]))continue;
            set.add(nums[i]);

            swap(nums, i, pos);
            dfs(pos + 1, nums, ret);

            swap(nums, pos, i);
        }
    }
    public void swap(int [] nums,int i ,int k){
        int tmp = nums[i];
        nums[i]=nums[k];
        nums[k]=tmp;
    }
}
