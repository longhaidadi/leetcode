package ict;

/**
 * Created by lon on 16-5-3.
 */

public class Solution64 {
    public static void main(String[] args) {
        Solution64 solution64 = new Solution64();
        int [][]board= {{1,2,5},{3,2,1}};
        int ret = solution64.minPathSum(board);
        System.out.println(ret);
    }
    public int minPathSum(int[][] grid) {
        if(grid==null || grid.length==0)return 0;
        int m = grid.length;
        int n = grid[0].length;
        int []minPath = new int[n];
        minPath[0]=0;
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
              if(i==0 && j!=0) minPath[j] = minPath[j-1]+grid[0][j];
                else{
                  if(j==0) minPath[j]=minPath[j]+grid[i][0];
                  else minPath[j]=Math.min(minPath[j],minPath[j-1])+grid[i][j];
              }
            }
        }
        return minPath[n-1];
    }

    public int minPathSum1(int [][]grid){
        if(grid == null || grid.length ==0) return 0;
        int m = grid.length;
        int n = grid.length;
        int [] minPath = new int[n];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n ; j++) {
                if(i==0 && j!=0) minPath[j] =  minPath[j-1]+grid[i][j];
                else if(j==0) minPath[j] = minPath[j] + grid[i][j];
                else minPath[j] = Math.min(minPath[j],minPath[j-1]) + grid[i][j];
            }
        }
        return  minPath[n-1];
    }
}
