package jd;

import java.util.Scanner;

/**
 * Created by lon on 16-9-5.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mnum = scanner.nextInt();
        int [] height = new int[mnum];
        for (int i = 0; i <mnum ; i++) {
            height[i] = scanner.nextInt();
        }
        System.out.println(height);
        int ans = helper(height);
        System.out.println(ans);
    }
    static int helper(int [] height){
        if(height==null || height.length ==0 ) return 0;
        int len = height.length;
        int ans = 0;
        int leftCount = getLeftCount(height, 0, len);
        len -= (leftCount-1);
        int rightCount = 0;
        int index = 0;
        while (index<len){
            int minIndex = getMin(height, index, len);
            if(index!=0)  leftCount = minIndex - index;

            rightCount = getRightCount(height,index,len);

            System.out.println("minIndex " + minIndex);
            System.out.println("leftCount " + leftCount);
            System.out.println("rightCount " + rightCount);

            ans += getAns(leftCount,rightCount);
            index = minIndex + rightCount;

            System.out.println("ans " + ans);
        }
        return ans;
    }
    static int getLeftCount(int [] height, int index , int len){
        int count = 0;
        while (index+len>=0){
            if(height[(index+len)%len]<height[(index+len-1)%len]){
                index--;
                count++;
            }else break;
        }
        //return (index+len)%len;
        return count;
    }
    static int getMin(int [] height,int index,int len){
        while (index<len){
            if(height[index]>height[(index+1)%len]){
                index++;
            }else break;
        }
        return index;
    }
    static int getRightCount(int[] height,int index,int len){
        int count = 0;
        while (index<len){
            if(height[index]<height[(index+1)%len]){
                index++;
                count++;
            }else break;
        }
        //return index;
        return count;
    }
    static int getAns(int left,int right){
        return left*right;
    }

}
