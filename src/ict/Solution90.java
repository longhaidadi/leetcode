package ict;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Created by lon on 16-3-22.
 */
public class Solution90 {
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        Solution90 solution90 = new Solution90();
        solution90.subsetsWithDup(nums);

    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        dfs(tmp,ret,nums,0);
        System.out.println(ret);
        return ret;
    }
    public void dfs(List<Integer> tmpList,List<List<Integer>> ret ,int[] nums, int pos){
        if(pos==nums.length){
            if(!ret.contains(tmpList))
                 ret.add(new ArrayList<>(tmpList));
            return;
        }
        tmpList.add(nums[pos]);
        dfs(tmpList, ret, nums, pos + 1);
        tmpList.remove(tmpList.size() - 1);
        dfs(tmpList,ret,nums,pos+1);
    }
}
