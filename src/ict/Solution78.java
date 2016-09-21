package ict;

/**
 * Created by lon on 16-6-19.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Solution78 {
    public List<List<Integer>> subsets(int [] nums){
        Arrays.sort(nums);
        List<List<Integer>>results = new ArrayList<>();

        helper(nums,results,new ArrayList<Integer>(),0);
        return results;
    }
    private void helper(int [] nums,List<List<Integer>> result,List<Integer>list,int curPos){
        if(curPos==nums.length){
           result.add(list);
            return;
        }
        helper(nums,result,list,curPos+1);
        List<Integer> list2 = new ArrayList<>(list);
        list2.add(nums[curPos]);
        helper(nums,result,list2,curPos+1);
    }

    public static void main(String[] args) {
        int [] array = {3,2,1};
        List<List<Integer>>list = new Solution78().subsets(array);
        System.out.println(list);
    }
}
