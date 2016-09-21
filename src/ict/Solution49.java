package ict;
import java.util.*;

/**
 * Created by lon on 16-4-29.
 */
public class Solution49 {
    public static void main(String[] args) {
        String [] array = {"and","dan"};
        List<List<String>> ret = new Solution49().groupAnagrams(array);
        System.out.println(ret);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ret = new ArrayList<>();
        if(strs==null || strs.length==0)return ret;
        Arrays.sort(strs);

        Map<String,List<String>> map = new HashMap<>();
        for(String str:strs){
            char [] cA = str.toCharArray();
            Arrays.sort(cA);
            String t = String.valueOf(cA);
            if(!map.containsKey(t)){
                map.put(t,new ArrayList<String>());
            }
            map.get(t).add(str);
        }
        for(Map.Entry<String,List<String>>entry:map.entrySet()){
            ret.add(entry.getValue());
        }
        return ret;
    }

}
