package ict;

/**
 * Created by lon on 16-3-23.
 */
public class Solution125 {
    public static void main(String[] args) {
        Solution125 solution125 = new Solution125();
        System.out.println(solution125.isPalindrome("1b1"));
    }
    public boolean isPalindrome(String s) {
        if(s==null )return false;
        if(s.equals("")) return true;
        int i =0;
        int j = s.length()-1;
        while (i<j){
            while (i<s.length() && !isChar(s.charAt(i)))i++;
            while (j>=0 && !isChar(s.charAt(j)))j--;
            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j)))return false;
            i++;
            j--;
        }
        return true;
    }
    public boolean isChar(char c){
        return ('a'<=c&&c<='z') || ('A'<=c && c<='Z')|| ('0'<=c && c<='9');
    }
}
