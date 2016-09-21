package hiho;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by lon on 16-8-26.
 */
public class Solution1032 {
    static char sep = '*';
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseNums = sc.nextInt();
        sc.nextLine();
        for(int i =0 ;i<caseNums;i++){
            run(sc.nextLine());
        }
    }

    static void run(String str){
        str = getNewStr(str);
        int [] array = new int[str.length()];
        int maxId = 0;
        Arrays.fill(array,1);
        int id = 0;
        int ans = 0;
        int maxMiddle = 0;
        for (int i = 1; i <str.length() ; i++) {
            if(maxId>i){
                array[i] = Math.min(array[2*id-i],maxId-i);
            }
            while (i-array[i]>=0 && i+ array[i]<str.length() && str.charAt(i+array[i])==str.charAt(i-array[i]))array[i]++;
            if(array[i]+i>maxId){
                maxId = array[i]+1;
                id = i;
            }
            if(ans<array[i]){
                ans = array[i];
                maxMiddle = id;
            }
        }
        int ret = 0;
        for (int i = 1; i < ans; i++) {
            if(str.charAt(maxMiddle)!=sep && str.charAt(maxMiddle-i)==str.charAt(maxMiddle+i))
                ret++;
        }

        System.out.println(ret);
    }
    static String getNewStr(String str){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i <str.length() ; i++) {
            sb.append(sep).append(str.charAt(i));
        }
        sb.append(sep);
        return sb.toString();
    }
}
