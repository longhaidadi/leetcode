package ict;

/**
 * Created by lon on 16-7-29.
 */
public class Solution72 {
    public int minDistance(String word1, String word2) {
        if(word1==null || word2==null)return 0;
        int len1 = word1.length();
        int len2 = word2.length();
        int [][] array = new int[len1+1][len2+1];
        for(int i =0;i<len1+1;i++)
            array[i][0]=i;
        for(int j =0;j<len2+1;j++)
            array[0][j]=j;
        for(int i =1;i<len1+1;i++){
            for(int j =1;j<len2+1;j++){
                int cost = 1;
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    cost = 0;
                }
                array[i][j]=Math.min(Math.min(array[i-1][j],array[i][j-1])+1,array[i-1][j-1]+cost);
            }
        }
        return array[len1][len2];


    }
}
