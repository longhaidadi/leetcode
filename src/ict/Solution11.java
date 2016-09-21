package ict;

/**
 * Created by lon on 16-3-23.
 */
public class Solution11 {
    public int maxArea(int[] height) {
        if(height==null || height.length<=1) return 0;
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;
        int curHeight = 0;
        while(left<right){
            curHeight = Math.min(height[left],height[right]);
            int area = curHeight *(right-left);
            if(area>maxArea)maxArea=area;
            if(height[left]<height[right])
                left++;
            else right--;

        }
        return maxArea;
    }

    public int maxArea1(int [] height){
        if(height==null || height.length==0)return 0;
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;
        int curHeight ;
        while (left<right){
            curHeight = Math.min(height[left],height[right]);
            int area = curHeight*(right-left);
            maxArea = Math.max(maxArea,area);
            if(height[left]>height[right]){
                right--;
            }else left++;
        }
        return maxArea;
    }

    public static void main(String[] args) {

    }
}
