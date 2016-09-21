package ict;

/**
 * Created by lon on 16-3-27.
 */
public class Solution58 {
    public int lengthOfLastWord(String s) {
        int len = 0;
        int lastlen = 0;
        for(char c : s.toCharArray()){
            if(c!=' '){
                len++;
            }else{
                if(len!=0)
                    lastlen=len;
                len=0;
            }
        }
            return len==0?lastlen:len;
    }
}
