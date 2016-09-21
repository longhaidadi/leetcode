package test;

import java.util.*;

import java.util.List;
/**
 * Created by lon on 16-4-6.
 */
public class Test2 {
    public static void main(String[] args) {
        boolean [] test1 =  {true,false};
        boolean [] test2 = {true,false};
        Set<boolean[]> set = new HashSet<boolean[]>();
        set.add(test1);
        set.add(test2);
        System.out.println(set);
    }
}
