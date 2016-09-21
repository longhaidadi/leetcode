package ict;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by lon on 16-3-6.
 */
public class MaxSum {
    public static List<Integer> solution(int [] array){
        List<Integer> retList = new ArrayList<>();
        int sum =0;
        int maxSum = 0;
        int beginPos = 0;
        int endPos = 0;
        int curPos = 0;
        for(int num : array){

           if(sum>=0){
               sum += num;
               endPos=curPos;
           }else{
               sum = num;
               beginPos=curPos;
           }
            if(sum>maxSum) {
                endPos=curPos;
                maxSum = sum;
            }
            curPos++;
        }

        System.out.println(beginPos+"\t"+endPos);
        System.out.println(maxSum);
        return retList;
    }

    public static void main(String[] args) {
        int [] array = {1,-2,3,10,-4,7,2,-5};
        solution(array);
    }
}
