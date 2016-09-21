package ict;

/**
 * Created by lon on 16-5-12.
 */
public class Solution345 {
    public String reverseVowels(String s) {
        if(s==null || s.length()<2)return s;
        int len = s.length();
        char [] array = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        while (start<end){
            while (!isVowels(array[start]))start++;
            while (!isVowels(array[end]))end--;
            char tmp = array[start];
            array[start]=array[end];
            array[end]=tmp;
        }
        return new String(array);
    }
    private boolean isVowels(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }

}
