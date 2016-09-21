package ict;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by lon on 16-8-4.
 */
public class Solution207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(numCourses==0 || prerequisites==null)return false;
        ArrayList<Integer>[] graph = new ArrayList[numCourses];
        for (int i = 0; i <numCourses ; i++) {
            graph[i]=new ArrayList<>();
        }

        for (int i = 0; i <prerequisites.length ; i++) {
            graph[prerequisites[i][1]].add(prerequisites[i][0]);
        }
        int [] visisted = new int[numCourses];
        for (int i = 0; i <prerequisites.length ; i++) {
            if(visisted[prerequisites[i][1]]==0){
                if(!dfs(graph,visisted,prerequisites[i][1]))
                    return false;
            }
        }
        return true;
    }

    private boolean dfs( ArrayList<Integer>[] graph , int[] visisted, int i) {
        if(visisted[i]==1)return false;
        if(visisted[i]==2)return true;
        visisted[i]=1;
        for(int next : graph[i]){
            if(!dfs(graph,visisted,next))
                return false;
        }
        visisted[i]=2;
        return true;
    }

    public static void main(String[] args) {
        int[][] prerequisites = {{1,0}};
        new Solution207().canFinish(2,prerequisites);
    }
}
