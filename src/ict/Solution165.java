package ict;

/**
 * Created by lon on 16-5-16.
 */
public class Solution165 {
    public int compareVersion(String version1, String version2) {
        String [] array1 = version1.split("\\.");
        String [] array2 = version2.split("\\.");
        if(array1[0].equals(array2[0])){
            int t1 = 0;
            if(array1.length!=1) t1 = Integer.parseInt(array1[1]);

            int t2 = 0;
            if(array2.length!=1) t2 = Integer.parseInt(array1[2]);

            if(t1==t2)return 0;
            else if(t1>t2)return 1;
            else return -1;

        } else {
            return array1[0].compareTo(array2[0]);
        }
    }

    public static void main(String[] args) {
        System.out.println((int)Integer.MIN_VALUE/(-1));
    }
}
