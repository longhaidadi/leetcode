package ict;

/**
 * Created by lon on 16-8-1.
 */
import java.util.*;

public class Solution187 {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String > list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for (int i = 0; i <s.length()-10 ; i++) {
            String t = s.substring(i,i+10);
            if(!set.add(t)){
                list.add(t);
            }
        }
        return list;
    }
}
