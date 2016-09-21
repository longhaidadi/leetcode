package ict;

/**
 * Created by lon on 16-2-17.
 */
public class Solution278_1 {
    public static int  binary_search(int len,int goal,int array[]){
        int start =0;
        int end = len-1;
        int mid ;
        while(start<=end){
            mid = start+(end-start)/2;
            if(array[mid]==goal)
                return mid;
            else if(array[mid]<goal)
                start=mid+1;
            else
                end=mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        System.out.println(binary_search(5,2,a));
    }
}
