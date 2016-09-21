package ict;

import java.util.Stack;

/**
 * Created by lon on 16-5-4.
 */
public class Solution84 {
    public static void main(String[] args) {

        int [] array = {1,1};
        Solution84 solution84 = new Solution84();
        int ret = solution84.largestRectangleArea(array);
        System.out.println(ret);
    }
    public int largestRectangleArea(int[] heights) {
        if(heights==null || heights.length==0)return 0;
        Stack<Integer>s = new Stack<>();
        int len = heights.length;
        int pos = 0;
        int maxArea = 0;
        while (pos<=len){
            if(s.isEmpty() || (pos!=len && heights[pos]>=s.peek() )){
                s.push(pos++);
            }else {
                if(!s.isEmpty()) {
                    int curH = heights[s.pop()];
                    int pre = s.isEmpty()?-1:s.peek();
                    maxArea = Math.max(maxArea,curH*(pos-pre-1));
                }
            }
        }
        return maxArea;
    }

    public int largestRectangleArea1(int[] heights){
        if(heights==null || heights.length ==0) return 0;
        Stack<Integer> stack = new Stack<>();
        int len = heights.length;
        int maxArea = 0;
        int i =0;
       while (i<=len){
            if(stack.isEmpty() ||(i!=len && heights[i]>heights[stack.peek()])){
                stack.push(i);
            }else{
                if(!stack.isEmpty()){
                    int curH = heights[i];
                    int pre = stack.isEmpty()?-1:stack.peek();
                    maxArea = Math.max(maxArea,curH*(i-pre+1));
                }
            }
        }
        return maxArea;
    }
}
