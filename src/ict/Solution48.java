package ict;

/**
 * Created by lon on 16-4-28.
 */
public class Solution48 {
    public static void main(String[] args) {

    }
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        int mid = (len)>>1;
        for(int i =0;i<mid;i++){
            for(int j =i;j<len;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[len-1-j][i];
                matrix[len-1-j][i]=matrix[len-1-i][len-1-j];
                matrix[len-1-i][len-1-j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

    }
}
