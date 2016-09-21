package ict.findNumber;

import java.util.Arrays;

/**
 * Created by lon on 16-4-25.
 */
public class FindSmallestK {
    public static void main(String[] args) {

    }

    private static int median3(int i , int j ,int k){
        int [] array = new int[3];
        array[0]=i;
        array[1]=j;
        array[2]=k;
        Arrays.sort(array);
        return array[1];
    }

    private static void quickSort(int S[],int k ,int left,int right){
     /*   int i ,j;
        int pivot;
        if(left<right){
            pivot=median3(S[0],left,right);
            i = left; j = right-1;
            for (;;){
                while (S[++i]<pivot);
                while (S[--j]>pivot);
                if(i<j){
                    Arrays.
                }
            }
        }*/
    }
}
