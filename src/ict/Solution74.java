package ict;

/**
 * Created by lon on 16-5-4.
 */
public class Solution74 {
    public static void main(String[] args) {
        Solution74 solution74 = new Solution74();
        int [][] array = {{1}};
        solution74.searchMatrix(array,1);
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0 || matrix[0].length==0)return false;
        int m = matrix.length;
        int n = matrix[0].length;
        int r = m*n -1;
        int l = 0;
        while (l<=r){
            int mid = l+((r-l)>>1);
            int m1 = mid/n;
            int n1 = mid%n;
            if(matrix[m1][n1]==target)return true;
            else if(matrix[m1][n1]<target)l = mid+1;
            else r = mid-1;
        }
        return false;
    }

    public boolean searchMatrix1(int[][] matrix, int target) {
        if(matrix == null || matrix.length ==0 || matrix[0].length==0) return false;
        int m = matrix.length;
        int n = matrix[0].length;
        int col = n;
        int row = 0;
        while (row <m && col >=0 ){
            if(matrix[row][col]==target)return true;
            else if (matrix[row][col]<target){
                col++;
            }else
                row--;
        }
        return false;
    }
}
