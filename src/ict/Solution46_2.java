package ict;

/**
 * Created by lon on 16-6-14.
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Solution46_2 {
    public static void main(String[] args) {
        int [] array = {1,2,3};
        List<List<Integer>> retList = new Solution46_2().permute(array);
        System.out.println(retList);
    }
    public List<List<Integer>> permute(int [] nums){
        List<List<Integer>> list = new ArrayList<>();
        if(nums== null || nums.length==0) return list;
        helper(list,nums,0);
        return list;
    }
    public void helper(List<List<Integer>> retList, int[] nums  , int pos){
        if(pos == nums.length){
           List tmp = new ArrayList();
            for(int n : nums){
                tmp.add(n);
            }
            retList.add(tmp);
        }else if(pos < nums.length){
            for (int i = pos; i < nums.length; i++) {
                swap(nums,pos,i);
                helper(retList, nums, pos + 1);
                swap(nums,pos,i);
            }
        }
    }
    public void swap(int [] nums , int i , int j){
        int t = nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
}
