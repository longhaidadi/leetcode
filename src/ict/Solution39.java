package ict;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by lon on 16-3-31.
 */
public class Solution39 {
    public static void main(String[] args) {
        Solution39 solution39 = new Solution39();
        int [] candidates = {8,7,4,3};
        Arrays.sort(candidates);

        List<List<Integer>> ret = solution39.combinationSum(candidates, 11);
        System.out.println(ret);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> retList = new ArrayList<>();

        backtracking(retList, new LinkedList<Integer>(), 0, target, candidates);
        return retList;
    }
    public void backtracking(List<List<Integer>> retList ,LinkedList<Integer> curList,int curPos, int curSum,int [] candidates){
        if(curSum<0)return;
        if(curSum==0){
            LinkedList<Integer>List = new LinkedList<>(curList);
            retList.add(List);
            return;
        }

        for(int i =curPos;i<candidates.length;i++){
            curList.add(candidates[i]);
            backtracking(retList, curList, i, curSum - candidates[i], candidates);
            curList.removeLast();
        }
    }

    public void backTracking1(List<List<Integer>>retList,LinkedList<Integer>curList, int curPos , int sum, int[] candidates){
        if(sum<0)return;
        if(sum==0){
            retList.add(new LinkedList<Integer>(curList));
        }else {
            for (int i = curPos; i <candidates.length ; i++) {
                curList.add(candidates[i]);
                backtracking(retList,curList,curPos,sum-candidates[i],candidates);
                curList.removeLast();
            }
        }
    }

}
