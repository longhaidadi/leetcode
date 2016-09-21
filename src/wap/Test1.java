package wap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Created by lon on 16-5-22.
 */

public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            list.add(i);
        }
        int t  = list.size()/2;
        System.out.println(list.subList(0,t));
        System.out.println(list.subList(t,list.size()));
    }
}
