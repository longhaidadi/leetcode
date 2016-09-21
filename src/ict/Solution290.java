package ict;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by lon on 16-3-23.
 */
public class Solution290 {
    public static void main(String[] args) {
        Solution290 solution290 = new Solution290();
        System.out.println(solution290.wordPattern("abba","dog cat cat dog"));
    }
    public boolean wordPattern(String pattern, String str) {
        String [] ret = str.split(" ");

        if(pattern.length()!=ret.length)return false;
        String [] array = new String[26];
        Set<String> set = new HashSet<>();
        for(int i = 0;i<pattern.length();i++){
            if(array[pattern.charAt(i)-'a']==null) {
                array[pattern.charAt(i) - 'a'] = ret[i];
                if (!set.add(ret[i])) return false;
            }
            else {
                if(!array[pattern.charAt(i)-'a'].equals(ret[i]))
                    return false;
            }
        }
        return true;
    }
}
