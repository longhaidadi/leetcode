package ict;

import java.util.Arrays;

/**
 * Created by lon on 16-8-15.
 */
public class Solution03 {
    public static void main(String[] args) {
        new Solution03().lengthOfLongestSubstring("abcabcbb");
    }
    public int lengthOfLongestSubstring(String s) {


        int i = 0, maxLen = 0;
        int[] charMap = new int[256];
        Arrays.fill(charMap, -1);

        for (int j = 0; j < s.length(); j++) {
            if (charMap[s.charAt(j)] >= i) {
                i = charMap[s.charAt(j)] + 1;
            }

            charMap[s.charAt(j)] = j;
            maxLen = Math.max(maxLen, j-i+1);
        }

        return maxLen;
    }
    public int lengthOfLongestSubstring1(String s) {
        if(s==null || s.length()==0)return 0;
        int [] array = new int[256];
        Arrays.fill(array,-1);
        int start = 0;
        int maxLen = 0;
        for (int i = 0; i <s.length() ; i++) {
            char c = s.charAt(i);
            if(array[c]>start){
                start = array[c]+1;
            }
            array[c]=i;
            maxLen = Math.max(maxLen,i-start+1);
        }
        return maxLen;
    }
}
