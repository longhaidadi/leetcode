package ict;

import java.util.Arrays;

/**
 * Created by lon on 16-4-5.
 */
public class Solution316 {
    public String removeDuplicateLetters(String s) {
        int [] array = new int[256];
        int [] visited = new int[256];
        Arrays.fill(array,0);
        Arrays.fill(visited,0);

        StringBuffer sb = new StringBuffer();
        sb.append(0);
        for(int i =0;i<s.length();i++) array[s.charAt(i)]++;
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(visited[c]!=0)continue;

        }
        return "";
    }

    public static void main(String[] args) {
        Solution316 solution316 = new Solution316();
        solution316.removeDuplicateLetters("bcabc");
    }
}
