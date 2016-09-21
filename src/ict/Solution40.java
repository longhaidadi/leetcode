package ict;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
/**
 * Created by lon on 16-3-23.
 */
public class Solution40 {
    public static void main(String[] args) {

        Solution40 solution40 = new Solution40();
        int [] nums = {10,1,2,7,6,1,5};
        solution40.combinationSum2(nums,8);
    }
  /*  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ret = new LinkedList<>();
        dfs(new LinkedList<Integer>(),ret,candidates,target,0,0);
        return ret;
    }

    public void dfs (LinkedList<Integer> tmp , List<List<Integer>> ret , int [] candidates,int target,int curSum,int pos){
        if(curSum==target && !ret.contains(tmp)){
            List<Integer> t = new LinkedList<>(tmp);
            ret.add(t);
            return;
        }
        for(int i =pos;i<candidates.length && curSum+candidates[i]<=target;i++){
            tmp.add(candidates[i]);
            dfs(tmp,ret,candidates,target,curSum+candidates[i],i+1);
            tmp.removeLast();
        }
    }*/
  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
      List<List<Integer>> retList = new ArrayList<>();
      if(candidates==null || candidates.length==0)return retList;
      Arrays.sort(candidates);
      helper(retList, candidates, 0, target, new LinkedList<Integer>());
      System.out.println(retList);
      return retList;
  }

    private void helper(List<List<Integer>> retList, int[] candidates, int curPos, int sum, LinkedList<Integer> list) {
        if(sum<0)return;
        if(sum==0){
            retList.add(new ArrayList<Integer>(list));
        }else{
            for (int i = curPos; i <candidates.length ; i++) {
                if(i!=curPos && candidates[i]==candidates[i-1])continue;
                list.add(candidates[i]);
                helper(retList, candidates, i + 1, sum - candidates[i], list);
                list.remove(list.size()-1);
            }
        }
    }

}
