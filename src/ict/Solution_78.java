package ict;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lon on 16-2-24.
 */
public class Solution_78 {
    public static List<List<Integer>>  subsets(int [] array){
        List<List<Integer>> ret = new ArrayList<>();

        int len = array.length;
        int numTotal = (int)Math.pow(2,len);
        for(int i =0;i<numTotal;i++){
            List<Integer> tmpList = new ArrayList<>();
            for(int j =0;j<len;j++) {
                if ((i & (1 << j)) !=0) {
                    tmpList.add(array[j]);
                }
            }
            ret.add(tmpList);
        }
        System.out.println(ret);
        return ret;
    }

    public static void main(String[] args) {
        int[]array = {1,2,3};
        subsets(array);
    }
}
