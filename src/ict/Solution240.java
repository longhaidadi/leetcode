package ict;

/**
 * Created by lon on 16-5-16.
 */
public class Solution240 {
    public static void main(String[] args) {
        int [][] matrix = {{5}};
        new Solution240().searchMatrix(matrix,-2);
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null)return false;
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = n-1;
        while (i<=m-1 && j>=0){
            if(matrix[i][j]==target)return true;
            else if (matrix[i][j]<target)i++;
            else j--;
        }
        return false;
    }
}
