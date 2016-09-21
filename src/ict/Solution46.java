package ict;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * Created by lon on 16-4-25.
 */
public class Solution46 {
    public static void main(String[] args) {
        int [] array = {1,2,3};
        List<List<Integer>> list = new Solution46().permute(array);
        System.out.println(list);
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums==null || nums.length ==0)return res;
        List<Integer> tmpList = new ArrayList<>();
        tmpList.add(nums[0]);
        res.add(tmpList);
        for(int i =1;i<nums.length;i++){
            int size = res.size();
            for(int j =0;j<size;j++){
                int size1 = res.get(0).size();
                for(int m =0;m<=size1;m++){
                    List<Integer> l = new ArrayList<>(res.get(0));
                    l.add(m,nums[i]);
                    res.add(l);
                }
                res.remove(0);
                System.out.println("**************");
                System.out.println(res);
            }
        }
        return res;
    }

}
