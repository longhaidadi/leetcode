package ict;

/**
 * Created by lon on 16-6-19.
 */
public class Solution59 {
    public static void main(String[] args) {
        Solution59 solution59 = new Solution59();
        int [][] array = solution59.genernateMatrix(4);
        solution59.printArray(array);
    }
    public void printArray(int[][]array){
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[0].length ; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    public int[][] genernateMatrix(int n){
        int [][] array = new int[n][n];
        int mid = (n+1)>>1;
        int sum = 1;
        for (int i = 0; i <mid ; i++) {
            int endY = n-i;
            int endX = n-i;
            for(int j = i;j<endY;j++)
                array[i][j]= sum++;
            for(int j = i+1;j<endY;j++)
                array[j][endY-1]=sum++;
            if(endX>i){
                for (int j = endY-1-1; j >=i ; j--) {
                    array[endX-1][j]=sum++;
                }
            }
            if(endY>i){
                for (int j = endX-1-1; j >i ; j--) {
                    array[j][i]=sum++;
                }
            }
        }
        return array;
    }
}
