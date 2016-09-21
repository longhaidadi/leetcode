package ict;

import java.util.Arrays;

/**
 * Created by lon on 16-5-3.
 */
public class Solution62 {
    public static void main(String[] args) {

    }
    public int uniquePaths(int m, int n) {
        int [] path = new int[n];
        Arrays.fill(path,1);
        for(int i =0;i<m;i++){
            for(int j =1;j<n;j++)
                path[j]=path[j]+path[j-1];
        }
        return path[n-1];
    }

    public int uniquePaths1(int m ,int n){
        int [] path = new int[n];
        Arrays.fill(path,1);
        for (int i = 1; i < m; i++) {
            for (int j = 1; j <n ; j++) {
                path[j] += path[j-1];
            }
        }
        return path[n-1];
    }
}
