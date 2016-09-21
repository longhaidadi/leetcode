package ict;

/**
 * Created by lon on 16-4-5.
 */
public class Solution264 {
    private int min(int a,int b , int c){
        return Math.min(a,Math.min(b,c));
    }
    public int nthUglyNumber(int n) {
        int [] array = new int[n];
        array[0]=1;

        int i =0;
        int j =0;
        int k =0;
        int next =1;
        while (next<n){
            int min = min(array[i]*2,array[j]*3,array[k]*3);
            array[next]=min;
            if(min==array[i]*2)i++;
            if(min==array[j]*3)j++;
            if(min==array[k]*5)k++;
            next++;
        }
        return array[n-1];
    }
}
