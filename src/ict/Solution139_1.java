package ict;

import java.util.Set;

/**
 * Created by lon on 16-6-21.
 */
public class Solution139_1 {
    public boolean wordBreak(String s ,Set<String> wordDict){
        if(s==null || s.isEmpty())return true;
        int len = s.length();
        boolean [] flags = new boolean[len+1];
        for (int i = 1; i <=len ; i++) {
            String tmp = s.substring(0,i);
            if(wordDict.contains(tmp)){
                flags[i]=true;
            }else {
                for (int j = 1; j <i; j++) {
                    if(flags[j] && wordDict.contains(s.substring(j+1,i))){
                        flags[i]=true;
                    }
                }
            }
        }
        return flags[len];

    }
}
