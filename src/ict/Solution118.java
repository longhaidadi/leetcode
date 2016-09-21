package ict;

/**
 * Created by lon on 16-7-30.
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList();
        if(numRows<=0)return ret;
        List<Integer> list = new LinkedList<>();
        list.add(1);
        ret.add(list);
        for (int i = 0; i <5-1 ; i++) {
            List<Integer> l = ret.get(i);
            List<Integer>newList = new ArrayList<>();
            newList.add(1);
            for(int j =0;j<l.size()-1;j++){
                newList.add(l.get(j)+l.get(j+1));
            }
            newList.add(1);
            ret.add(newList);
        }
        return ret;
    }

    public static void main(String[] args) {
        List<List<Integer>> ret=new Solution118().generate(5);
        System.out.println(ret);
    }
}
