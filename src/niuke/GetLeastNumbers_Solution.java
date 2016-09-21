package niuke;

import java.util.ArrayList;

/**
 * Created by lon on 16-5-30.
 */
public class GetLeastNumbers_Solution {
    public static void main(String[] args) {
        int [] array = {4,5,1,6,2,7,3,8};
        new GetLeastNumbers_Solution().GetLeastNumbers_Solution(array,2);
    }
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if(input==null || input.length==0 || input.length<k)return list;
        partition(input, 0, input.length - 1, k,list);
        System.out.println(list);
        return list;
    }

    public void partition(int [] input , int low , int high ,int k,ArrayList<Integer> list){
        int start = low;
        int end =  high;
        if(start<=end){
            int temp = input[start];
            while (start<end){
                while (end>start && input[end]>=temp)
                    end--;
                input[start]=input[end];
                while (start<end && input[start]<=temp)
                    start++;
                input[end]=input[start];
            }
            input[start]= temp;
            int len = start-low;
            if(len==k){
                for(int i =0;i<len;i++)
                    list.add(input[low+i]);
                return;
            }
            if(len<k) {
                for (int i = 0; i <=len ; i++) {
                    list.add(input[low+i]);
                }
                partition(input, start+1 , high, k - len-1 , list);
            }
            else partition(input,low,start-1,k,list);
        }
    }
}
