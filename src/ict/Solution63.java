package ict;

/**
 * Created by lon on 16-5-3.
 */
public class Solution63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid==null || obstacleGrid.length==0) return 0;
        if(obstacleGrid[0][0]==1)return 0;
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if(obstacleGrid[0][0]==1 || obstacleGrid[m-1][n-1]==1)return 0;
        int[] path = new int[n];
        path[0]=1;
        for (int i = 0; i <m ; i++) {
            for (int h = 0; h <n ; h++) {
                if(obstacleGrid[i][h]==1){
                    path[h]=0;
                    continue;
                }
                if(h!=0)path[h] += path[h-1];
            }
        }
        return path[n-1];

    }

    public static void main(String[] args) {
        int [][] path = {{0,0},{1,1},{0,0}};
        Solution63 solution63 = new Solution63();
        solution63.uniquePathsWithObstacles(path);
    }
}
