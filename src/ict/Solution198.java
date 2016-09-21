package ict;

/**
 * Created by lon on 16-6-22.
 */
public class Solution198 {
    // 相邻的数的最大值
    //max[i]= Math.max(max[i-1],max[i-2]+num[i]);
    public int rob(int [] num){
        if(num==null || num.length==0)return 0;
        if(num.length==1)return num[0];
        int [] array = new int[num.length];
        array[1]=Math.max(num[0],num[1]);
        for (int i = 2; i <num.length ; i++) {
            array[i]=Math.max(array[i-1],array[i-2]+num[i]);
        }
        return array[array.length-1];
    }
}
