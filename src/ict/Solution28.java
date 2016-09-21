package ict;

/**
 * Created by lon on 16-4-6.
 */
public class Solution28 {
    public static void main(String[] args) {
        Solution28 solution28 = new Solution28();
        int pos = solution28.strStr("aaa","aa");
        System.out.println(pos);
    }
    public int strStr(String haystack, String needle) {
        if(needle.equals(""))return haystack.equals("")?0:-1;
        int [] next = next(needle);
        printNext(next);
        int j =0;
        for(int i =0;i<haystack.length();i++){
            while(j>0 && haystack.charAt(i)!=needle.charAt(j)){
                j = next[j];
            }
            if(haystack.charAt(i)==needle.charAt(j))j++;
            if(j==needle.length())
                return i+1-j;

        }
        return -1;
    }
    private static void printNext(int[]next){
        System.out.println("print next");
        for(int n : next)
            System.out.println(n);
    }

    public int[] next(String pattern){
        int [] next = new int[pattern.length()+1];
        next[0]=next[1]=0;
        int j =0;
        for(int i = 1;i<pattern.length();i++){
            while(j>0 && pattern.charAt(j)!=pattern.charAt(i)) j = next[j];
            if(pattern.charAt(i)==pattern.charAt(j))j++;
            next[i+1]=j;
        }
        return next;
    }
}
