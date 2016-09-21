package ict;
import java.util.*;

/**
 * Created by lon on 16-8-1.
 */
public class Solution179 {
    public String largestNumber(int[] nums) {
        if(nums==null)return "";
        List<Integer> list = new ArrayList<Integer>();
        for(int n : nums)list.add(n);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String t1 = String.valueOf(o1);
                String t2 = String.valueOf(o2);
                return -(t1+t2).compareTo(t2+t1);
            }
        });
        StringBuffer sb = new StringBuffer();
        for (int n : list)
            sb.append(n);
        return sb.toString();
    }

    public static void main(String[] args) {
        int [] nums = {3, 30, 34, 5, 9};
        new Solution179().largestNumber(nums);
    }
}
