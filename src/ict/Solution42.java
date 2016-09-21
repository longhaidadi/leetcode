package ict;

/**
 * Created by lon on 16-8-29.
 */
public class Solution42 {
    public int trap(int[] height) {
        if(height==null || height.length==0)return 0;
        int maxArea = 0;
        int maxHeightIndex = 0;
        for (int i = 0; i < height.length; i++) {
            if(height[maxHeightIndex]<height[i])maxHeightIndex = i;
        }

        int preMax = 0;
        for (int i = 0; i <maxHeightIndex ; i++) {
            if(height[i]>preMax)  maxArea += (maxHeightIndex-i)*(height[i]-preMax);
            preMax=Math.max(preMax,height[i]);
            maxArea -= height[i];
        }
        preMax = 0;
        for (int i = height.length-1; i >maxHeightIndex ; i--) {
            if(height[i]>preMax) maxArea += (i-maxHeightIndex)*(height[i]-preMax);
            preMax=Math.max(preMax,height[i]);
            maxArea -= height[i];
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int [] height = {3,2,4};
        int area = new Solution42().trap(height);
        System.out.println(area);
    }
}
