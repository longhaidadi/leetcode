package niuke;

import java.util.*;

/**
 * Created by lon on 16-5-30.
 */

public class PrintMinNumber {
    public String PrintMinNumber(int [] numbers) {

        if(numbers==null || numbers.length==0)return "";
        if(numbers.length==1)return String.valueOf(numbers[0]);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String v1 = String.valueOf(o1) + String.valueOf(o2);
                String v2 = String.valueOf(o2) + String.valueOf(o1);
                return v1.compareTo(v2);
            }
        });
        StringBuffer sb = new StringBuffer();
        for(int s : list)
            sb.append(s);
        return sb.toString();




    }
}
