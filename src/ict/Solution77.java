package ict;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by lon on 16-4-1.
 */
public class Solution77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ret = new ArrayList<>();
        backtracking(n+1, k,new LinkedList<Integer>(),ret,1);
        return ret;
    }

    public void backtracking(int n,int k ,LinkedList<Integer> curList,List<List<Integer>>retList,int curPos){
        if(curList.size()==k){
            //Ok
            LinkedList<Integer> list = new LinkedList<>(curList);
            retList.add(list);
            return;
        }
        //curList.add(curPos);
        for(int i =curPos;i<n;i++){
            curList.add(i);
            backtracking(n, k, curList, retList, i+1);
            curList.removeLast();
        }
        //curList.removeLast();
    }
    public static void main(String[] args) {
        Solution77 solution77 = new Solution77();
        List<List<Integer>> ret = solution77.combine(4, 2);
        System.out.println(ret);
    }

}
