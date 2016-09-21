package hiho;

import java.util.Scanner;

/**
 * Created by lon on 16-4-23.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseNums = sc.nextInt();
        for(int i =0 ;i<caseNums;i++){
            String pattern = sc.next();
            String original = sc.next();
            System.out.println(strStrNum(pattern, original));
        }
    }

    private static int strStrNum(String pattern,String original){
        if(pattern.equals(""))return 0;
        char [] oriChar = original.toCharArray();
        char [] patChar = pattern.toCharArray();
        int [] next = next(patChar);
        int j =0;
        int num = 0;
        for(int i = 0;i<oriChar.length;i++){
            if(j< patChar.length && patChar[j]==oriChar[i])j++;
            else {
                while (j != 0 ) {
                    j = next[j];
                    if (patChar[j] == oriChar[i]) {
                        j++;
                        break;
                    }
                }
            }
            if (j == patChar.length) {
                num++;
            }
        }
        return num;
    }
    private static int [] next(char[] pattern){
        int [] next = new int[pattern.length+1];
        next[0]=next[1]=0;
        for(int i = 1;i<pattern.length;i++){
            int j = i;
            while (j>0){
                j = next[j];
                if(pattern[j]==pattern[i]){
                    next[i+1]=j+1;
                    break;
                }
            }
        }
        return next;
    }
}
