package ict;

import java.util.Stack;

/**
 * Created by lon on 16-9-6.
 */
public class Solution85 {
    public int maximalRectangle(char[][] matrix) {
        if(matrix == null || matrix.length ==0 || matrix[0].length==0)return 0;
        int col = matrix[0].length;
        int row = matrix.length;
        int [] h = new int[col+1];
        h[col]=0;
        int max = 0;
        for (int i = 0; i < row; i++) {
            Stack<Integer> stack = new Stack<>();
            for (int j = 0; j <col ; j++) {
                if(j<col){
                    if(matrix[i][j]=='1') h[j] +=1;
                    else h[j]=0;
                }
                if(stack.isEmpty() || h[stack.peek()]<=h[j])stack.push(j);
                else{
                    while (!stack.isEmpty()&&h[j]<h[stack.peek()]){
                        int top = stack.pop();
                        int area = h[top]*(stack.isEmpty()?(j+1):j-stack.peek()-1);
                        if(area>max)
                            max = area;
                    }
                    stack.push(j);
                }
            }
        }
        return max;
    }
}
